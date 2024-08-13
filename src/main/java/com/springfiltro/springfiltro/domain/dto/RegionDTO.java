package com.springfiltro.springfiltro.domain.dto;

import com.springfiltro.springfiltro.persistence.entities.Region;

public class RegionDTO {
    private Long idRegion;
    private String namereg;
    private Long idCountry;
    
    public RegionDTO() {
    }

    public RegionDTO(Region region) {
        this.idRegion = region.getIdRegion();
        this.namereg = region.getNamereg();
        this.idRegion = region.getCountry() != null ? region.getCountry().getIdCountry() : null;
    }

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

    public Long getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }

    
    
}
