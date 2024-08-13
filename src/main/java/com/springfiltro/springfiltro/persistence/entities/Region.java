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
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codereg")
    private Long idRegion;

    @Column(name = "namereg")
    private String namereg;

    @ManyToOne
    @JoinColumn(name = "codecountry")
    private Country country;

    public Region() {}

    
    public Long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }

    public String getNamereg() {
        return namereg;
    }

    public void setNamereg(String namereg) {
        this.namereg = namereg;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    
    
}
