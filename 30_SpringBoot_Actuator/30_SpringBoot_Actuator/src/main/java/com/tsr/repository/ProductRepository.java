package com.tsr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsr.entitys.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
