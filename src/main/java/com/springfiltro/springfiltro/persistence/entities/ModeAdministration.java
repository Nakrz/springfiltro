package com.springfiltro.springfiltro.persistence.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "modeadministration")
public class ModeAdministration {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idModeAdministration;

    @Column(name = "descriptionmode")
    private String descriptionmode;

    public ModeAdministration() {
    }

    public Long getIdModeAdministration() {
        return idModeAdministration;
    }

    public void setIdModeAdministration(Long idModeAdministration) {
        this.idModeAdministration = idModeAdministration;
    }

    public String getDescriptionmode() {
        return descriptionmode;
    }

    public void setDescriptionmode(String descriptionmode) {
        this.descriptionmode = descriptionmode;
    }

    

}
