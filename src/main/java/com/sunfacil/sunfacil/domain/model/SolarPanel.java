package com.sunfacil.sunfacil.domain.model;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class SolarPanel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SolarPanelModel> models;


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

    public List<SolarPanelModel> getModels() {
        return models;
    }

    public void setModels(List<SolarPanelModel> models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "SolarPanel{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", models=" + models +
                '}';
    }
}
