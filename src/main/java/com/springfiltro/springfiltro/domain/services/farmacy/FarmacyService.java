package com.springfiltro.springfiltro.domain.services.farmacy;

import java.util.List;
import java.util.Optional;

import com.springfiltro.springfiltro.persistence.entities.Farmacy;


public interface FarmacyService {

    List<Farmacy> findAll();
    Optional<Farmacy> findById(Long id);
    Farmacy save(Farmacy farmacy);
    Farmacy update(Long id, Farmacy farmacy);
    Optional<Farmacy> delete(Long id);

}
