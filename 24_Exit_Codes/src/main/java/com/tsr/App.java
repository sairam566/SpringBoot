package com.tsr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tsr.bean.Student;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = SpringApplication.run(App.class, args);
    	try {
			Student student = context.getBean(Student.class);
			System.out.println(student);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("In Finally Block");
			System.exit(SpringApplication.exit(context));
		}
    }
    
    @Bean
    public CommandLineRunner runner() {
    	return (args)->{
    		System.out.println("In Command Line Runner");
    		Integer.parseInt("TSR");
    	};
    }
    
}
