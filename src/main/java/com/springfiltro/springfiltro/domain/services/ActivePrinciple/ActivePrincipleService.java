package com.springfiltro.springfiltro.domain.services.ActivePrinciple;

import java.util.List;
import java.util.Optional;

import com.springfiltro.springfiltro.persistence.entities.ActivePrinciple;

public interface ActivePrincipleService {
    
    List<ActivePrinciple> findAll();
    Optional<ActivePrinciple> findById(Long id);
    ActivePrinciple save(ActivePrinciple activePrinciple);
    ActivePrinciple update(Long id, ActivePrinciple activePrinciple);
    Optional<ActivePrinciple> delete(Long id);

}
