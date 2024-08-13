package com.springfiltro.springfiltro.domain.services.country;

import java.util.List;
import java.util.Optional;

import com.springfiltro.springfiltro.persistence.entities.Country;

public interface CountryService {

    List<Country> findAll();
    Optional<Country> findById(Long id);
    Country save(Country country);
    Country update(Long id, Country country);
    Optional<Country> delete(Long id);
}
