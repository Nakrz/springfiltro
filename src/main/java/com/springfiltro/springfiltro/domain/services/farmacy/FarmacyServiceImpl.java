package com.springfiltro.springfiltro.domain.services.farmacy;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springfiltro.springfiltro.persistence.entities.Farmacy;
import com.springfiltro.springfiltro.persistence.repositories.FarmacyRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class FarmacyServiceImpl implements FarmacyService {
    
    private FarmacyRepository farmacyRepository;

    public FarmacyServiceImpl(FarmacyRepository farmacyRepository) {
        this.farmacyRepository = farmacyRepository;
    }

    @Override
    public List<Farmacy> findAll(){
        return farmacyRepository.findAll();
    }

    @Override
    public Optional<Farmacy> findById(Long id){
        return farmacyRepository.findById(id);
    }

    @Override
    @Transactional
    public Farmacy save(Farmacy farmacy){
        return farmacyRepository.save(farmacy);
    }

    @Override
    @Transactional
    public Farmacy update(Long id, Farmacy farmacy){
        if(!farmacyRepository.existsById(id)){
            throw new EntityNotFoundException("La farmacia con id " + id + " no fue encontrado");
        }
        farmacy.setIdFarmacy(id);
        return farmacyRepository.save(farmacy);
    }

    @Override
    @Transactional
    public Optional<Farmacy> delete(Long id){
        Optional<Farmacy> farmacy = farmacyRepository.findById(id);
        if (farmacy.isPresent()){
            farmacyRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("La farmacia con id " + id + " no fue encontrado");
        }
        return farmacy;
    }
}
