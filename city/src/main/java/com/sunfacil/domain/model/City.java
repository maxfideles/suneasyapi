package com.sunfacil.domain.model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class City implements Serializable {
    @Id
    private long id;
    private String name;
    private String state;
    private Double lat;
    private Double lon;
    private Double temp;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Diffuse> diffuseList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Horizontal> horizontalList;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
