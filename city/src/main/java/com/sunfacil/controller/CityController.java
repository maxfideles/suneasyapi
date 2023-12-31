package com.sunfacil.controller;


import com.sunfacil.domain.model.*;
import com.sunfacil.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{city}/{state}")
    public ResponseData getByName(@PathVariable String city, @PathVariable String state){

        ResponseData responseData = new ResponseData();
        City citySelected = cityService.findCityByName(city,state);
        System.out.println(citySelected.getId());
        Optional<Diffuse> diffuse = cityService.findDifById(citySelected.getId());
        System.out.println(diffuse);
        Optional<Horizontal> horizontal = cityService.findHorById(citySelected.getId());
        System.out.println(horizontal);
        Optional<TiltedLat> tiltedLat = cityService.findTiltedById(citySelected.getId());

        responseData.setCity(citySelected);
        responseData.setDiffuseList(diffuse);
        responseData.setHorizontalList(horizontal);
        responseData.setTiltedLatList(tiltedLat);
        return responseData;
    }

    @GetMapping("/dif/{id}")
    public Optional<Diffuse> getDifById(@PathVariable Long id){
        return cityService.findDifById(id);
    }

    @PostMapping("/dif")
    public List<Diffuse> addDif(@RequestBody List<Diffuse> diffuses){
        return cityService.addDiffuse(diffuses);
    }

    @GetMapping("/hor/{id}")
    public Optional<Horizontal> getHorById(@PathVariable Long id){

        return cityService.findHorById(id);
    }

    @PostMapping("/hor")
    public List<Horizontal> addHor(@RequestBody List<Horizontal> horizontals){
        return cityService.addHorizontal(horizontals);
    }

    @GetMapping("/tilted/{id}")
    public Optional<TiltedLat> getTiltedById(@PathVariable Long id){
        return cityService.findTiltedById(id);
    }

    @PostMapping("/tilted")
    public List<TiltedLat> addTilted(@RequestBody List<TiltedLat> tiltedLats){
        return cityService.addTilted(tiltedLats);
    }
}


