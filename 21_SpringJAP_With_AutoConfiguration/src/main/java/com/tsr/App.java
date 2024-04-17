package com.tsr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tsr.service.ProductService;

@SpringBootApplication

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = SpringApplication.run(App.class, args);
    	ProductService productService = context.getBean(ProductService.class);
    	productService.getAllProducts().forEach(System.out::println);
    }
}
