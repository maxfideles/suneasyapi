package com.sunfacil.sunfacil.service.impl;

import com.sunfacil.sunfacil.domain.model.Inverter;
import com.sunfacil.sunfacil.domain.model.InverterModel;
import com.sunfacil.sunfacil.domain.model.SolarPanelModel;
import com.sunfacil.sunfacil.domain.repository.InverterModelRepository;
import com.sunfacil.sunfacil.domain.repository.InverterRepository;
import com.sunfacil.sunfacil.service.InverterService;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InverterServiceImpl implements InverterService {

    private final InverterRepository inverterRepository;
    private final InverterModelRepository inverterModelRepository;

    public InverterServiceImpl(InverterRepository inverterRepository, InverterModelRepository inverterModelRepository){
        this.inverterModelRepository = inverterModelRepository;
        this.inverterRepository = inverterRepository;
    }
    @Override
    public Inverter findByManufacturer(String manufacturer) {
        return inverterRepository.findByManufacturer(manufacturer);
    }

    @Override
    public Inverter createInverter(Inverter inverterToBeCreated) {
        Optional<Inverter> inverters = Optional.ofNullable(inverterRepository.findByManufacturer(inverterToBeCreated.getManufacturer()));

        if(inverters.isPresent()){
            Inverter inverter = inverters.get();
            inverter.getModels().addAll(inverterToBeCreated.getModels());

            return inverterRepository.save(inverter);
        }else{
            return inverterRepository.save(inverterToBeCreated);
        }
    }

    @Override
    public List<Inverter> getAll() {
        return inverterRepository.findAll();
    }

    @Override
    public InverterModel findByModel(String modelName) {

        if(inverterModelRepository.existsByNameIgnoreCase(modelName)){
            return inverterModelRepository.findByNameIgnoreCase(modelName);
        }else{
            throw new IllegalArgumentException("Not Found!");
        }
    }


    //Find the Models from the Manufacture id
    @Override
    public List<InverterModel> findById(Long id) {

        var inverters = inverterRepository.findById(id);
        return inverterModelRepository.findModelsByManufacturer(inverters.get().getManufacturer());
    }
}
