package com.sunfacil.sunfacil.service;

import com.sunfacil.sunfacil.domain.model.Inverter;
import com.sunfacil.sunfacil.domain.model.InverterModel;

import java.util.List;

public interface InverterService {

    Inverter findByManufacturer(String manufacturer);

    Inverter createInverter(Inverter inverterToBeCreated);

    List<Inverter> getAll();

    InverterModel findByModel(String modelName);


}
