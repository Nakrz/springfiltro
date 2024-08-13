package com.springfiltro.springfiltro.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springfiltro.springfiltro.persistence.entities.ActivePrinciple;

public interface ActivePrincipleRepository extends JpaRepository<ActivePrinciple, Long>{
    
}
