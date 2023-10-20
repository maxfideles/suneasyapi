package com.sunfacil.sunfacil.domain.model;

import jakarta.persistence.*;

@Entity
public class InverterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private double capacity;
    private double efficiency;
    private double inputVoltageMin;
    private double inputVoltageMax;
    private double outputVoltage;
    private int numberMPPTs;
    private double maxInputCurrent;

    private double maxOutputCurrent;

    private double maxInputShortCircuitCurrent;

    private String gridConnection;

    private double gridVoltage;

    private double weight;
    private int warrantyYears;

    private String manufacturer;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getInputVoltageMin() {
        return inputVoltageMin;
    }

    public void setInputVoltageMin(double inputVoltageMin) {
        this.inputVoltageMin = inputVoltageMin;
    }

    public double getInputVoltageMax() {
        return inputVoltageMax;
    }

    public void setInputVoltageMax(double inputVoltageMax) {
        this.inputVoltageMax = inputVoltageMax;
    }

    public double getOutputVoltage() {
        return outputVoltage;
    }

    public void setOutputVoltage(double outputVoltage) {
        this.outputVoltage = outputVoltage;
    }

    public int getNumberMPPTs() {
        return numberMPPTs;
    }

    public void setNumberMPPTs(int numberMPPTs) {
        this.numberMPPTs = numberMPPTs;
    }

    public double getMaxInputCurrent() {
        return maxInputCurrent;
    }

    public void setMaxInputCurrent(double maxInputCurrent) {
        this.maxInputCurrent = maxInputCurrent;
    }

    public double getMaxOutputCurrent() {
        return maxOutputCurrent;
    }

    public void setMaxOutputCurrent(double maxOutputCurrent) {
        this.maxOutputCurrent = maxOutputCurrent;
    }

    public double getMaxInputShortCircuitCurrent() {
        return maxInputShortCircuitCurrent;
    }

    public void setMaxInputShortCircuitCurrent(double maxInputShortCircuitCurrent) {
        this.maxInputShortCircuitCurrent = maxInputShortCircuitCurrent;
    }

    public String getGridConnection() {
        return gridConnection;
    }

    public void setGridConnection(String gridConnection) {
        this.gridConnection = gridConnection;
    }

    public double getGridVoltage() {
        return gridVoltage;
    }

    public void setGridVoltage(double gridVoltage) {
        this.gridVoltage = gridVoltage;
    }

    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}