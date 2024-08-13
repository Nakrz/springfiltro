package com.springfiltro.springfiltro.persistence.entities;


import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@Table(name = "customer")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcustomer")
    private Long idCustomer;

    @Column(name = "namecustomer")
    private String namecustomer;
    
    @Column(name = "lastnamecustomer")
    private String lastnamecustomer;

    @Column(name = "emailcustomer")
    private String emailcustomer;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "ion")
    private BigDecimal ion;

    @Column(name = "latitud")
    private BigDecimal latitud;

    @ManyToOne
    @JoinColumn(name = "codecitycustomer")
    private City city;


    public Customer() {
    }


    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNamecustomer() {
        return namecustomer;
    }

    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }

    public String getLastnamecustomer() {
        return lastnamecustomer;
    }

    public void setLastnamecustomer(String lastnamecustomer) {
        this.lastnamecustomer = lastnamecustomer;
    }

    public String getEmailcustomer() {
        return emailcustomer;
    }

    public void setEmailcustomer(String emailcustomer) {
        this.emailcustomer = emailcustomer;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public BigDecimal getIon() {
        return ion;
    }

    public void setIon(BigDecimal ion) {
        this.ion = ion;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    
}
