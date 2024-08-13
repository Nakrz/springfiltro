package com.springfiltro.springfiltro.domain.services.unitMeasurement;

import java.util.List;
import java.util.Optional;

import com.springfiltro.springfiltro.persistence.entities.UnitMeasurement;


public interface UnitMeasurementService {

    List<UnitMeasurement> findAll();
    Optional<UnitMeasurement> findById(Long id);
    UnitMeasurement save(UnitMeasurement unitMeasurement);
    UnitMeasurement update(Long id, UnitMeasurement unitMeasurement);
    Optional<UnitMeasurement> delete(Long id);
    
}
