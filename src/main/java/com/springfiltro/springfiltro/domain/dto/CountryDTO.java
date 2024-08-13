package com.springfiltro.springfiltro.domain.dto;

import com.springfiltro.springfiltro.persistence.entities.Country;

public class CountryDTO {
    private Long idCountry;
    private String namecountry;

    public CountryDTO() {
    }

    public CountryDTO(Country country) {
        this.idCountry = country.getIdCountry();
        this.namecountry = country.getNamecountry();
    }

    public Long getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }

    public String getNamecountry() {
        return namecountry;
    }

    public void setNamecountry(String namecountry) {
        this.namecountry = namecountry;
    }

    
    
}
