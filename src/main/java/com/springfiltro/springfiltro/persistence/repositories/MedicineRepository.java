package com.springfiltro.springfiltro.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springfiltro.springfiltro.persistence.entities.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    
}
