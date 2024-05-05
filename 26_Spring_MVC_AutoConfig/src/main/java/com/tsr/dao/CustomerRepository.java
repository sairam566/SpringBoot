package com.tsr.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsr.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
