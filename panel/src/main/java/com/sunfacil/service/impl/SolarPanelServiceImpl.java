package com.sunfacil.service.impl;

import com.sunfacil.service.SolarPanelService;
import com.sunfacil.domain.repository.SolarPanelModelRepository;
import com.sunfacil.domain.repository.SolarPanelRepository;
import com.sunfacil.domain.model.SolarPanel;
import com.sunfacil.domain.model.SolarPanelModel;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class SolarPanelServiceImpl implements SolarPanelService {

    private final SolarPanelRepository solarPanelRepository;
    private final SolarPanelModelRepository solarPanelModelRepository;


    public SolarPanelServiceImpl(SolarPanelRepository solarPanelRepository, SolarPanelModelRepository solarPanelModelRepository){
        this.solarPanelRepository = solarPanelRepository;
        this.solarPanelModelRepository = solarPanelModelRepository;
    }

    @Override
    public SolarPanel findByManufacturer(String panelBrand) {
        return solarPanelRepository.findByManufacturerIgnoreCase(panelBrand).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public SolarPanel createPanel(SolarPanel panelToBeCreated) {
        Optional<SolarPanel> panelFiltered = solarPanelRepository.findByManufacturerIgnoreCase(panelToBeCreated.getManufacturer());

        if(panelFiltered.isPresent()){
            SolarPanel panel = panelFiltered.get();
            panel.getModels().addAll(panelToBeCreated.getModels());
            return solarPanelRepository.save(panel);
        }else {
            return solarPanelRepository.save(panelToBeCreated);
        }
    }

    @Override
    public SolarPanelModel findByModel(String modelName) {

        if(solarPanelModelRepository.existsByNameIgnoreCase(modelName)){
            return solarPanelModelRepository.findByNameIgnoreCase(modelName);
        }else{
            throw new EntityNotFoundException("Solar Panel Model Not Found!");

        }
    }

    @Override
    public List<SolarPanel> getAll() {
        System.out.println("Getting From Solar Panel Service");
        return solarPanelRepository.findAll(Sort.by("manufacturer"));
    }

    @Override
    public List<SolarPanelModel> findById(Long id) {
        System.out.println(id);
        var panels = solarPanelRepository.findById(id);
        return solarPanelModelRepository.findByManufacturer(panels.get().getManufacturer());
    }


}
