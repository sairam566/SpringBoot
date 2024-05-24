package com.tsr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tsr.repository.ProductRepository;

@RestController
public class ProductsHome {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping(value = "/product/{id}")
	public String listAll(@PathVariable("id") int id) {
		return productRepository.getById(id).getName();
	}
}
