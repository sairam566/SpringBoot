package com.tsr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.tsr.dao.ProductRepository;
import com.tsr.entitys.Product;

@DataJpaTest
public class AppTest 
{
    
	@Autowired
	private ProductRepository repo;
	
	private Product product;
	
	@BeforeEach
	public void setUp() {
		product = new Product();
		product.setpId(8965);
		product.setpName("TSR");
		product.setpPrice(566.66);
		repo.save(product);
	}
	
	@AfterEach
	public void tearDown() {
		repo.delete(product);
	}
	
	
	@Test
    public void productCount()
    {
		long actualCount = repo.count();
		assertEquals(1, actualCount);
    }
}
