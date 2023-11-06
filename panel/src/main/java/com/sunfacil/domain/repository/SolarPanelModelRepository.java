package com.sunfacil.domain.repository;

import com.sunfacil.domain.model.SolarPanelModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolarPanelModelRepository extends JpaRepository<SolarPanelModel,Long> {

    SolarPanelModel findByNameIgnoreCase(String modelName);

    List<SolarPanelModel> findByManufacturer (String manufacturerName);

    boolean existsByNameIgnoreCase(String modelName);

}
