package com.sunfacil.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TiltedLat {

    @Id
    private Long id;
    private Double annual;
    private Double JAN;
    private Double FEB;
    private Double MAR;
    private Double APR;
    private Double MAY;
    private Double JUN;
    private Double JUL;
    private Double AUG;
    private Double SEP;
    private Double OCT;
    private Double NOV;
    private Double DEC;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAnnual() {
        return annual;
    }

    public void setAnnual(Double annual) {
        this.annual = annual;
    }

    public Double getJAN() {
        return JAN;
    }

    public void setJAN(Double JAN) {
        this.JAN = JAN;
    }

    public Double getFEB() {
        return FEB;
    }

    public void setFEB(Double FEB) {
        this.FEB = FEB;
    }

    public Double getMAR() {
        return MAR;
    }

    public void setMAR(Double MAR) {
        this.MAR = MAR;
    }

    public Double getAPR() {
        return APR;
    }

    public void setAPR(Double APR) {
        this.APR = APR;
    }

    public Double getMAY() {
        return MAY;
    }

    public void setMAY(Double MAY) {
        this.MAY = MAY;
    }

    public Double getJUN() {
        return JUN;
    }

    public void setJUN(Double JUN) {
        this.JUN = JUN;
    }

    public Double getJUL() {
        return JUL;
    }

    public void setJUL(Double JUL) {
        this.JUL = JUL;
    }

    public Double getAUG() {
        return AUG;
    }

    public void setAUG(Double AUG) {
        this.AUG = AUG;
    }

    public Double getSEP() {
        return SEP;
    }

    public void setSEP(Double SEP) {
        this.SEP = SEP;
    }

    public Double getOCT() {
        return OCT;
    }

    public void setOCT(Double OCT) {
        this.OCT = OCT;
    }

    public Double getNOV() {
        return NOV;
    }

    public void setNOV(Double NOV) {
        this.NOV = NOV;
    }

    public Double getDEC() {
        return DEC;
    }

    public void setDEC(Double DEC) {
        this.DEC = DEC;
    }

}
