package com.sunfacil.sunfacil.domain.repository;

import com.sunfacil.sunfacil.domain.model.InverterModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InverterModelRepository extends JpaRepository<InverterModel,Long> {

    InverterModel findByNameIgnoreCase(String name);
    boolean existsByNameIgnoreCase(String name);

    List<InverterModel> findModelsByManufacturer(String manufacturer);

}
