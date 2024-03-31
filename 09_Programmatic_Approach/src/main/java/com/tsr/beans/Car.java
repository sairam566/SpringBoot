package com.tsr.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Value("${name}")
	protected String name;

	public void start() {
		System.out.println(name+" Car Started");
	}
}
