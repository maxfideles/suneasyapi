package com.sunfacil.sunfacil.service.impl;

import com.sunfacil.sunfacil.domain.model.City;
import com.sunfacil.sunfacil.domain.repository.CityRepository;
import com.sunfacil.sunfacil.service.CityService;

import java.util.List;

public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
