package com.sunfacil.domain.model;

import java.util.List;
import java.util.Optional;

public class ResponseData {
    private City city;
    private Optional<Diffuse> diffuseList;

    private Optional<Horizontal> horizontalList;


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    public Optional<Diffuse> getDiffuseList() {
        return diffuseList;
    }

    public void setDiffuseList(Optional<Diffuse> diffuseList) {
        this.diffuseList = diffuseList;
    }

    public Optional<Horizontal> getHorizontalList() {
        return horizontalList;
    }

    public void setHorizontalList(Optional<Horizontal> horizontalList) {
        this.horizontalList = horizontalList;
    }
}
