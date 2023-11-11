package com.sunfacil.controller;


import com.sunfacil.domain.model.City;
import com.sunfacil.domain.model.Diffuse;
import com.sunfacil.service.CityService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController()
@CrossOrigin
@RequestMapping("/city")
public class CityController{

    @Autowired
    CityService cityService;


    @GetMapping()
    public List<City> getAllCities(){
        return cityService.getAll();
    }


    @PostMapping
    public List<City> addCity(@RequestBody List<City> city) {
        System.out.println(city);
        return cityService.addCity(city);
    }

    @GetMapping("/dif/{id}")
    public Optional<Diffuse> getDifById(@PathVariable Long id){
        return cityService.findDifById(id);
    }

    @PostMapping("/dif")
    public List<Diffuse> getDifById(@RequestBody List<Diffuse> diffuses){
        return cityService.addDiffuse(diffuses);
    }

}


