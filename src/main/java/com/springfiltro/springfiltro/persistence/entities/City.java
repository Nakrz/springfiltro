package com.springfiltro.springfiltro.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "city")
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codecity")
    private Long idCity;

    @Column(name = "namecity")
    private String namecity;

    @ManyToOne
    @JoinColumn(name = "codereg")
    private Region region;

    
    public City() {
    }

    public Long getIdCity() {
        return idCity;
    }

    public void setIdCity(Long idCity) {
        this.idCity = idCity;
    }

    public String getNamecity() {
        return namecity;
    }

    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    
}
