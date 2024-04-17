package com.tsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsr.bo.ProductBO;
import com.tsr.dao.ProductDAO;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO dao;
	
	public List<ProductBO> getAllProducts(){
		return dao.getAllProducts();
	}
}
