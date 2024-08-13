package com.springfiltro.springfiltro.domain.services.modeAdministration;

import java.util.List;
import java.util.Optional;

import com.springfiltro.springfiltro.persistence.entities.ModeAdministration;

public interface ModeAdministrationService {

    List<ModeAdministration> findAll();
    Optional<ModeAdministration> findById(Long id);
    ModeAdministration save(ModeAdministration modeAdministration);
    ModeAdministration update(Long id, ModeAdministration modeAdministration);
    Optional<ModeAdministration> delete(Long id);
}
