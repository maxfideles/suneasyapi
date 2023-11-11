package com.sunfacil.service.impl;

import com.sunfacil.domain.model.City;
import com.sunfacil.domain.model.Diffuse;
import com.sunfacil.domain.model.Horizontal;
import com.sunfacil.domain.repository.CityRepository;
import com.sunfacil.domain.repository.DiffuseRepository;
import com.sunfacil.domain.repository.HorizontalRepository;
import com.sunfacil.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final DiffuseRepository diffuseRepository;
    private final HorizontalRepository horizontalRepository;

    public CityServiceImpl(CityRepository cityRepository, DiffuseRepository diffuseRepository, HorizontalRepository horizontalRepository) {
        this.cityRepository = cityRepository;
        this.diffuseRepository = diffuseRepository;
        this.horizontalRepository = horizontalRepository;
    }

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public List<City> addCity(List<City> cityToBeAdded) {
        return cityRepository.saveAll(cityToBeAdded);
    }

    @Override
    public Optional<Diffuse> findDifById(Long id) {
        return diffuseRepository.findById(id);
    }

    @Override
    public List<Diffuse> addDiffuse(List<Diffuse> diffuses) {
        return diffuseRepository.saveAll(diffuses);
    }

    @Override
    public Optional<Horizontal> findHorById(Long id) {
        return horizontalRepository.findById(id);
    }

    @Override
    public List<Horizontal> addHorizontal(List<Horizontal> horizontals) {
        return horizontalRepository.saveAll(horizontals);
    }
}
