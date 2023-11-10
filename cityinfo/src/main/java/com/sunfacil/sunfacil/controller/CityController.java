package com.sunfacil.sunfacil.controller;


import com.sunfacil.sunfacil.domain.model.City;
import com.sunfacil.sunfacil.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
