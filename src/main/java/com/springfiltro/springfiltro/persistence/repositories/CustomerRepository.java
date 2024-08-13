package com.springfiltro.springfiltro.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springfiltro.springfiltro.persistence.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
