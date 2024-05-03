package com.tsr.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsr.entitys.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}