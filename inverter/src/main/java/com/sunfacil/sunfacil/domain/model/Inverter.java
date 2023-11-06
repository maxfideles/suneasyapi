package com.sunfacil.sunfacil.domain.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Inverter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<InverterModel> models;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<InverterModel> getModels() {
        return models;
    }

    public void setModels(List<InverterModel> models) {
        this.models = models;
    }

    // getters and setters
}
