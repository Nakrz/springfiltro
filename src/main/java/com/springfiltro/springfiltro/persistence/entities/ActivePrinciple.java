package com.springfiltro.springfiltro.persistence.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name = "activeprinciple")
public class ActivePrinciple {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idap")
    private Long idActivePrinciple;

    @Column(name = "nameap")
    private String nameap;

    public ActivePrinciple() {
    }

    public Long getIdActivePrinciple() {
        return idActivePrinciple;
    }

    public void setIdActivePrinciple(Long idActivePrinciple) {
        this.idActivePrinciple = idActivePrinciple;
    }

    public String getNameap() {
        return nameap;
    }

    public void setNameap(String nameap) {
        this.nameap = nameap;
    }

    
}
    
       
