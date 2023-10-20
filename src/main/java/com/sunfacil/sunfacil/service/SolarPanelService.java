package com.sunfacil.sunfacil.service;

import com.sunfacil.sunfacil.domain.model.SolarPanel;
import com.sunfacil.sunfacil.domain.model.SolarPanelModel;

import java.util.List;

public interface SolarPanelService {


    SolarPanel findByManufacturer(String panelBrand);

    SolarPanel createPanel(SolarPanel panelToBeCreated);

    SolarPanelModel findByModel(String modelName);
    List<SolarPanel> getAll();


}
