package com.sunfacil.sunfacil.controller;

import com.sunfacil.sunfacil.domain.model.SolarPanel;
import com.sunfacil.sunfacil.domain.model.SolarPanelModel;
import com.sunfacil.sunfacil.service.SolarPanelService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Solar Panels", description = "Get Solar Panels Information Detailed")
@RestController
@CrossOrigin
@RequestMapping("/panels")
public class SolarPanelController {

    @Autowired
    SolarPanelService solarPanelService;


    @Operation(summary = "Get All Solar Panels Available")
    @GetMapping()
    public List<SolarPanel> getAll(){
       return solarPanelService.getAll();
    }

    @PostMapping
    public ResponseEntity<SolarPanel> addPanel(@RequestBody SolarPanel solarPanel){

        return  ResponseEntity.ok(solarPanelService.createPanel(solarPanel));
    }

    @Operation(summary = "Get Solar Panels By Its Manufacturer")
    @GetMapping("/{manufacturerName}")
    public ResponseEntity<SolarPanel> getManufacturer(@Parameter(description = "Solar Panel Manufacturer Name") @PathVariable String manufacturerName){
        return ResponseEntity.ok(solarPanelService.findByManufacturer(manufacturerName));
    }

    @Operation(summary = "Get A Solar Panel By Its Model Name")
    @GetMapping("/panelManufacturer/{modelName}")
    public ResponseEntity<SolarPanelModel> getModel(@Parameter(description = "Solar Panel Model Name")@PathVariable String modelName){
        return ResponseEntity.ok(solarPanelService.findByModel(modelName));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<List<SolarPanelModel>> getPanelModelsByIdManufacturer (@PathVariable Long id){
        return ResponseEntity.ok(solarPanelService.findById(id));
    }


}
