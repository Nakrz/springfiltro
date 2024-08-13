package com.springfiltro.springfiltro.domain.services.customer;

import java.util.List;
import java.util.Optional;

import com.springfiltro.springfiltro.persistence.entities.Customer;

public interface CustomerService {
    
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    Customer save(Customer customer);
    Customer update(Long id, Customer customer);
    Optional<Customer> delete(Long id);
}
