package com.tsr.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public Student() {
		super();
		System.out.println("Student Object created");
	}

	public void grade() {
		System.out.println("Studen got 'A' Grade");
	}
}
