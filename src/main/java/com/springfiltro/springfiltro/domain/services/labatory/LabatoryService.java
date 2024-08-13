package com.springfiltro.springfiltro.domain.services.labatory;

import java.util.List;
import java.util.Optional;

import com.springfiltro.springfiltro.persistence.entities.Labatory;

public interface LabatoryService {

    List<Labatory> findAll();
    Optional<Labatory> findById(Long id);
    Labatory save(Labatory labatory);
    Labatory update(Long id, Labatory labatory);
    Optional<Labatory> delete(Long id);
    
}
