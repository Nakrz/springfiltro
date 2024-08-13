package com.springfiltro.springfiltro.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springfiltro.springfiltro.persistence.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{
    
}
