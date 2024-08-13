package com.springfiltro.springfiltro.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springfiltro.springfiltro.persistence.entities.UnitMeasurement;


public interface UnitMeasurementRepository extends JpaRepository<UnitMeasurement, Long>{
    
}
