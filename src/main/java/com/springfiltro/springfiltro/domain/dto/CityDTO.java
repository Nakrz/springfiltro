package com.springfiltro.springfiltro.domain.dto;

import com.springfiltro.springfiltro.persistence.entities.City;

public class CityDTO {
   private Long idCity;
   private String namereg;
   private Long idRegion;

    public CityDTO() {
    }

    public CityDTO(City city) {
        this.idCity = city.getIdCity();
        this.namereg = city.getNamecity();
        this.idRegion = city.getRegion() != null ? city.getRegion().getIdRegion() : null;
    }

    public Long getIdCity() {
        return idCity;
    }

    public void setIdCity(Long idCity) {
        this.idCity = idCity;
    }

    public String getNamereg() {
        return namereg;
    }

    public void setNamereg(String namereg) {
        this.namereg = namereg;
    }

    public Long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }

    
   
}
