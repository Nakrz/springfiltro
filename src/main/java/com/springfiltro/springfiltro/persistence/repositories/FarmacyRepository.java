package com.springfiltro.springfiltro.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springfiltro.springfiltro.persistence.entities.Farmacy;

public interface FarmacyRepository extends JpaRepository<Farmacy, Long>{
    
}
