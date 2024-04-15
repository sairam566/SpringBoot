package com.tsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tsr.bo.ProductBO;
import com.tsr.dao.ProductsDAO;

@Service
public class ProductService {
	
	@Autowired
	private ProductsDAO dao;
	
	@Transactional(readOnly = true)
	public List<ProductBO> getAllProducts(){
		return dao.getAllProducts();
	}
}
