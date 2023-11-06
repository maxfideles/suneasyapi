package com.sunfacil.sunfacil.domain.model;

import java.io.Serializable;
import java.util.List;

public class DataResponse implements Serializable {

    private Boolean success;
    private Integer count;

    private List<Inverter> data;

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

    public List<Inverter> getData() {return data;}

    public void setData(List<Inverter> data) {
        this.data = data;
    }

}
