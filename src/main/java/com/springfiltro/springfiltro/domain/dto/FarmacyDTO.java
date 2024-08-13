package com.springfiltro.springfiltro.domain.dto;

import java.math.BigDecimal;

import com.springfiltro.springfiltro.persistence.entities.Farmacy;

public class FarmacyDTO {

    private Long idFarmacy;
    private String namefarmacy;
    private String addressfarmacy;
    private BigDecimal longs;
    private BigDecimal latfarmacy;
    private Long codecityfarm;
    private String logofarmacy;

    public FarmacyDTO() {
    }
    
    public FarmacyDTO(Farmacy farmacy) {
        this.idFarmacy = farmacy.getIdFarmacy();
        this.namefarmacy = farmacy.getNamefarmacy();
        this.addressfarmacy = farmacy.getAddressfarmacy();
        this.longs = farmacy.getLongs();
        this.latfarmacy = farmacy.getLatfarmacy();
        this.codecityfarm = farmacy.getCity() != null ? farmacy.getCity().getIdCity() : null;
        this.logofarmacy = farmacy.getLogofarmacy();
    }

    public Long getIdFarmacy() {
        return idFarmacy;
    }

    public void setIdFarmacy(Long idFarmacy) {
        this.idFarmacy = idFarmacy;
    }

    public String getNamefarmacy() {
        return namefarmacy;
    }

    public void setNamefarmacy(String namefarmacy) {
        this.namefarmacy = namefarmacy;
    }

    public String getAddressfarmacy() {
        return addressfarmacy;
    }

    public void setAddressfarmacy(String addressfarmacy) {
        this.addressfarmacy = addressfarmacy;
    }

    public BigDecimal getLongs() {
        return longs;
    }

    public void setLongs(BigDecimal longs) {
        this.longs = longs;
    }

    public BigDecimal getLatfarmacy() {
        return latfarmacy;
    }

    public void setLatfarmacy(BigDecimal latfarmacy) {
        this.latfarmacy = latfarmacy;
    }

    public Long getCodecityfarm() {
        return codecityfarm;
    }

    public void setCodecityfarm(Long codecityfarm) {
        this.codecityfarm = codecityfarm;
    }

    public String getLogofarmacy() {
        return logofarmacy;
    }

    public void setLogofarmacy(String logofarmacy) {
        this.logofarmacy = logofarmacy;
    }

    
}
