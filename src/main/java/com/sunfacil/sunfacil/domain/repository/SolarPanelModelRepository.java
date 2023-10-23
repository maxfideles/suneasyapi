package com.sunfacil.sunfacil.domain.repository;

import com.sunfacil.sunfacil.domain.model.SolarPanelModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SolarPanelModelRepository extends JpaRepository<SolarPanelModel,Long> {

    SolarPanelModel findByNameIgnoreCase(String modelName);

    List<SolarPanelModel> findByManufacturer (String manufacturerName);

    boolean existsByNameIgnoreCase(String modelName);

}
