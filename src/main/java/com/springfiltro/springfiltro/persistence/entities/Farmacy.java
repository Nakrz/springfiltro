package com.springfiltro.springfiltro.persistence.entities;


import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "farmacy")
public class Farmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfarmacy")
    private Long idFarmacy;

    @Column(name = "namefarmacy")
    private String namefarmacy;

    @Column(name = "addressfarmacy")
    private String addressfarmacy;

    @Column(name = "longs")
    private BigDecimal longs;

    @Column(name = "latfarmacy")
    private BigDecimal latfarmacy;

    @ManyToOne
    @JoinColumn(name = "codecity")
    private City city;

    @Column(name = "logofarmacy")
    private String logofarmacy;

    
    public Farmacy() {
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getLogofarmacy() {
        return logofarmacy;
    }

    public void setLogofarmacy(String logofarmacy) {
        this.logofarmacy = logofarmacy;
    }


}
