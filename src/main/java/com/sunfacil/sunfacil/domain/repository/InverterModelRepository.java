package com.sunfacil.sunfacil.domain.repository;

import com.sunfacil.sunfacil.domain.model.InverterModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InverterModelRepository extends JpaRepository<InverterModel,Long> {

    InverterModel findByNameIgnoreCase(String name);
    boolean existsByNameIgnoreCase(String name);
}
