package com.springfiltro.springfiltro.domain.services.City;

import java.util.List;
import java.util.Optional;

import com.springfiltro.springfiltro.persistence.entities.City;

public interface CityService {
    
    List<City> findAll();
    Optional<City> findById(Long id);
    City save(City city);
    City update(Long id, City city);
    Optional<City> delete(Long id);
}
