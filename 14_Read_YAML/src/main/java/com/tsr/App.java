package com.tsr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tsr.beans.Student;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = SpringApplication.run(App.class, args);
    	Student student = applicationContext.getBean(Student.class);
    	System.out.println(student);
    }
}
