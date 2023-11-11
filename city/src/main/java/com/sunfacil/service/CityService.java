package com.sunfacil.service;

import com.sunfacil.domain.model.City;
import com.sunfacil.domain.model.Diffuse;
import com.sunfacil.domain.model.Horizontal;

import java.util.List;
import java.util.Optional;

public interface CityService {

    List<City> getAll();

    List<City> addCity (List<City> cityToBeAdded);

    City findCityByName(String city, String state);

    Optional<Diffuse> findDifById(Long id);

    List<Diffuse> addDiffuse(List<Diffuse> diffuses);

    Optional<Horizontal> findHorById(Long id);
    List<Horizontal> addHorizontal(List<Horizontal> horizontals);
}
