package com.springfiltro.springfiltro.domain.services.medicine;

import java.util.List;
import java.util.Optional;

import com.springfiltro.springfiltro.persistence.entities.Medicine;

public interface MedicineService {

    List<Medicine> findAll();
    Optional<Medicine> findById(Long id);
    Medicine save(Medicine medicine);
    Medicine update(Long id, Medicine medicine);
    Optional<Medicine> delete(Long id);
}
