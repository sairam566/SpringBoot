package com.tsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tsr.config.JavaConfig;
import com.tsr.service.ProductService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	ProductService productService = context.getBean(ProductService.class);
    	productService.getAllProducts().forEach(System.out::println);
    }
}
