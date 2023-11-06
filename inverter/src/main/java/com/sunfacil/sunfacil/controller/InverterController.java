package com.sunfacil.sunfacil.controller;

import com.sunfacil.sunfacil.domain.model.DataResponse;
import com.sunfacil.sunfacil.domain.model.Inverter;
import com.sunfacil.sunfacil.domain.model.InverterModel;
import com.sunfacil.sunfacil.service.InverterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Inverters", description = "Get Inverters Information Detailed")
@RestController
@CrossOrigin
@RequestMapping("/inverters")
public class InverterController {

    @Autowired
    InverterService inverterService;

    @Cacheable(cacheNames = "inverters", key = "'invertersKey'")
    @Operation(summary = "Get all Inverters Available")
    @GetMapping
    public DataResponse getAll(){
        List<Inverter> results = inverterService.getAll();
        DataResponse response = new DataResponse();
        response.setSuccess(true);
        response.setCount(results.size());
        response.setData(results);

        return response;

    }

    @CacheEvict(value = "inverters",allEntries = true)
    @PostMapping
    public ResponseEntity<Inverter> addInverter(@RequestBody Inverter inverter){
        return ResponseEntity.ok(inverterService.createInverter(inverter));
    }

    @Operation(summary = "Get Inverters By Its Manufacturer")
    @GetMapping("/{inverterManufacturer}")
    public ResponseEntity<Inverter> getManufacturer(@Parameter(description = "Inverter Manufacturer Name") @PathVariable String inverterManufacturer){
        return ResponseEntity.ok(inverterService.findByManufacturer(inverterManufacturer));
    }


    @Operation(summary = "Get A Inverter By Its Model Name")
    @GetMapping("/inverterManufacturer/{inverterModel}")
    public ResponseEntity<InverterModel> getInverterModel (@Parameter(description = "Inverter Model Name") @PathVariable String inverterModel){
        return ResponseEntity.ok(inverterService.findByModel(inverterModel));
    }


    @GetMapping("/id/{id}")
    public ResponseEntity<List<InverterModel>> getInverterModelsByIdManufacturer(@PathVariable Long id){
        return ResponseEntity.ok(inverterService.findById(id));
    }


}
