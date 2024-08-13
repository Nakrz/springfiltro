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
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idMedicine;

    @Column(name = "proceedings")
    private String proceedings;
    
    @Column(name = "namemedicine")
    private String namemedicine;

    @Column(name = "healthregister")
    private String healthregister;

    @Column(name = "description")
    private String description;

    @Column(name = "descriptionshort")
    private String descriptionshort;

    @Column(name = "namerol")
    private String namerol;

    @ManyToOne
    @JoinColumn(name = "codemodeadmin")
    private ModeAdministration modeAdministration;

    @ManyToOne
    @JoinColumn(name = "codeap")
    private ActivePrinciple activePrinciple;

    @ManyToOne
    @JoinColumn(name = "codeum")
    private UnitMeasurement unitMeasurement;

    @ManyToOne
    @JoinColumn(name = "codelab")
    private Labatory labatory;

}
