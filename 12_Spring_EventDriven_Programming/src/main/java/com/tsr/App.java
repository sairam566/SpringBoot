package com.tsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tsr.config.JavaConfig;
import com.tsr.controller.CityController;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	CityController cityController = context.getBean(CityController.class);
    	cityController.changeCity("TSR-1", 56);
    }
}
