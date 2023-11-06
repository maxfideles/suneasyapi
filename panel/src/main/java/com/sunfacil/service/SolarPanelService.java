package com.sunfacil.service;

import com.sunfacil.domain.model.SolarPanel;
import com.sunfacil.domain.model.SolarPanelModel;

import java.util.List;

public interface SolarPanelService {


    SolarPanel findByManufacturer(String panelBrand);

    SolarPanel createPanel(SolarPanel panelToBeCreated);

    SolarPanelModel findByModel(String modelName);
    List<SolarPanel> getAll();

    List<SolarPanelModel> findById(Long id);


}
