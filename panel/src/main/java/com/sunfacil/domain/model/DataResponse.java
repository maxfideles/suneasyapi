package com.sunfacil.domain.model;

import java.io.Serializable;
import java.util.List;

public class DataResponse implements Serializable {

    private Boolean success;
    private Integer count;
    private List<SolarPanel> data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<SolarPanel> getData() {
        return data;
    }

    public void setData(List<SolarPanel> data) {
        this.data = data;
    }
}
