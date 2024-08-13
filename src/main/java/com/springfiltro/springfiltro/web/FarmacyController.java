package com.springfiltro.springfiltro.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springfiltro.springfiltro.domain.dto.FarmacyDTO;
import com.springfiltro.springfiltro.domain.services.farmacy.FarmacyService;
import com.springfiltro.springfiltro.persistence.entities.Farmacy;

@Controller
@RequestMapping("/farmacy")
public class FarmacyController {
    
    private FarmacyService farmacyService;


    public FarmacyController(FarmacyService farmacyService) {
        this.farmacyService = farmacyService;
    }

    @GetMapping
    public ResponseEntity<List<FarmacyDTO>> listFarmacy() {
        List<Farmacy> farmacys = farmacyService.findAll();
        List<FarmacyDTO> farmacysDTO = farmacys.stream().map(FarmacyDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok(farmacysDTO);
    }
    
    @PostMapping("/new")
    public ResponseEntity<FarmacyDTO> createFarmacy(@RequestBody FarmacyDTO farmacyDTO) {
        Farmacy farmacy = new Farmacy();
        farmacy.setIdFarmacy(farmacyDTO.getIdFarmacy());
        farmacy.setNamefarmacy(farmacyDTO.getNamefarmacy());
        farmacy.setAddressfarmacy(farmacyDTO.getAddressfarmacy());
        farmacy.setLongs(farmacyDTO.getLongs());
        farmacy.setLatfarmacy(farmacyDTO.getLatfarmacy());
        farmacy.setLogofarmacy(farmacyDTO.getLogofarmacy());

        Farmacy nuevoFarmacy = farmacyService.save(farmacy);
        return ResponseEntity.status(HttpStatus.CREATED).body(new FarmacyDTO(nuevoFarmacy));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<FarmacyDTO> updateFarmacy(@PathVariable Long id, @RequestBody FarmacyDTO farmacyDTO) {
        if (farmacyService.findById(id).isPresent()) {
            Farmacy farmacy = new Farmacy();
            farmacy.setIdFarmacy(farmacyDTO.getIdFarmacy());
            farmacy.setNamefarmacy(farmacyDTO.getNamefarmacy());
            farmacy.setAddressfarmacy(farmacyDTO.getAddressfarmacy());
            farmacy.setLongs(farmacyDTO.getLongs());
            farmacy.setLatfarmacy(farmacyDTO.getLatfarmacy());
            farmacy.setLogofarmacy(farmacyDTO.getLogofarmacy());

            Farmacy farmacyActualizado = farmacyService.update(id, farmacy);
            return ResponseEntity.ok(new FarmacyDTO(farmacyActualizado));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFarmacy(@PathVariable Long id) {
        if (farmacyService.findById(id).isPresent()) {
            farmacyService.delete(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
