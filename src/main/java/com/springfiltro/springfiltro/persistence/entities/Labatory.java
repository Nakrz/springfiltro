package com.springfiltro.springfiltro.persistence.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "labatory")
public class Labatory {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idLabatory;

    @Column(name = "namelab")
    private String namelab;

    @ManyToOne
    @JoinColumn(name = "codecityreg")
    private City city;

    public Labatory() {
    }

    public Long getIdLabatory() {
        return idLabatory;
    }

    public void setIdLabatory(Long idLabatory) {
        this.idLabatory = idLabatory;
    }

    public String getNamelab() {
        return namelab;
    }

    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    

}
