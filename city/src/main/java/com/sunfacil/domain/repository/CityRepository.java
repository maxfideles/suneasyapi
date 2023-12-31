package com.sunfacil.domain.repository;

import com.sunfacil.domain.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

    City findByAllIgnoreCaseNameAndState(String city, String state);
}
