package com.sunfacil.service.impl;

import com.sunfacil.domain.model.City;
import com.sunfacil.domain.model.Diffuse;
import com.sunfacil.domain.model.Horizontal;
import com.sunfacil.domain.model.TiltedLat;
import com.sunfacil.domain.repository.CityRepository;
import com.sunfacil.domain.repository.DiffuseRepository;
import com.sunfacil.domain.repository.HorizontalRepository;
import com.sunfacil.domain.repository.TiltedLatRepository;
import com.sunfacil.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;
    @Autowired
    DiffuseRepository diffuseRepository;
    @Autowired
    HorizontalRepository horizontalRepository;
    @Autowired
    TiltedLatRepository tiltedLatRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public List<City> addCity(List<City> cityToBeAdded) {
        return cityRepository.saveAll(cityToBeAdded);
    }

    @Override
    public City findCityByName(String city, String state) {
        return cityRepository.findByAllIgnoreCaseNameAndState(city,state);
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

    @Override
    public Optional<TiltedLat> findTiltedById(Long id) {
        return tiltedLatRepository.findById(id);
    }

    @Override
    public List<TiltedLat> addTilted(List<TiltedLat> tiltedLats) {
        return tiltedLatRepository.saveAll(tiltedLats);
    }
}
