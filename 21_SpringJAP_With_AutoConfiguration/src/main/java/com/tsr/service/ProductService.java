package com.tsr.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsr.bo.ProductBO;
import com.tsr.dao.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<ProductBO> getAllProducts() {
		return productRepository.findAll().stream().map((product) -> {
			ProductBO bo = new ProductBO();
			bo.setpId(product.getpId());
			bo.setpName(product.getpName());
			bo.setpPrice(product.getpPrice());
			return bo;
		}).collect(Collectors.toList());
	}
}
