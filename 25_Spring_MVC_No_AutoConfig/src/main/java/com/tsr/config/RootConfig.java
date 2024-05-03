package com.tsr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {
	
	@Bean(name = "TSR")
	public String test() {
		System.out.println("Loading First ");
		return "test-------------";
	}
}
