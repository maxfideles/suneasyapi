package com.sunfacil.sunfacil.controller;

import com.sunfacil.sunfacil.domain.model.Inverter;
import com.sunfacil.sunfacil.domain.model.InverterModel;
import com.sunfacil.sunfacil.service.InverterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Inverters", description = "Get Inverters Information Detailed")
@RestController
@CrossOrigin
@RequestMapping("/inverters")
public class InverterController {

    private final InverterService inverterService;

    public InverterController(InverterService inverterService) {
        this.inverterService = inverterService;
    }

    @Operation(summary = "Get all Inverters Available")
    @GetMapping
    public List<Inverter> getAll(){return inverterService.getAll();}


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
