package com.tsr.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsr.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
