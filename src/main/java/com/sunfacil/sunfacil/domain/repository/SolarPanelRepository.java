package com.sunfacil.sunfacil.domain.repository;

import com.sunfacil.sunfacil.domain.model.SolarPanel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SolarPanelRepository extends JpaRepository<SolarPanel,Long> {

    Optional<SolarPanel> findByManufacturerIgnoreCase(String manufactureName);
}
