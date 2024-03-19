package com.tsr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tsr.beans.Student;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
		Student stu = applicationContext.getBean(Student.class);
		System.out.println(stu);
	}
}