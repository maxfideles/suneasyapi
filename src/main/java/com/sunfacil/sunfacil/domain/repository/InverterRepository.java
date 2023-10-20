package com.sunfacil.sunfacil.domain.repository;

import com.sunfacil.sunfacil.domain.model.Inverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InverterRepository extends JpaRepository<Inverter,Long> {

    Inverter findByManufacturer(String manufacturer);
}
