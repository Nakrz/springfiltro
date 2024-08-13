package com.springfiltro.springfiltro.domain.services.farmacyMedicine;

import java.util.List;
import java.util.Optional;

import com.springfiltro.springfiltro.persistence.entities.FarmacyMedicine;

public interface FarmacyMedicineService {
    List<FarmacyMedicine> findAll();
    Optional<FarmacyMedicine> findById(Long id);
    FarmacyMedicine save(FarmacyMedicine medicine);
    FarmacyMedicine update(Long id, FarmacyMedicine medicine);
    Optional<FarmacyMedicine> delete(Long id);
}
