package com.tsr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.tsr.service.ProductService;

@SpringBootApplication
@EnableTransactionManagement
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = SpringApplication.run(App.class, args);
    	ProductService service = context.getBean(ProductService.class);
    	service.getAllProducts().forEach(System.out::println);
    }
}
