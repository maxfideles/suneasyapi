package com.sunfacil.service;

import com.sunfacil.domain.model.City;
import com.sunfacil.domain.model.Diffuse;

import java.util.List;
import java.util.Optional;

public interface CityService {

    List<City> getAll();

    List<City> addCity (List<City> cityToBeAdded);

    Optional<Diffuse> findDifById(Long id);

    List<Diffuse> addDiffuse(List<Diffuse> diffuses);
}
