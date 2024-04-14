package com.tsr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.tsr.beans.Bean_A;
import com.tsr.beans.Bean_C;

@Configuration
@Profile(value = "DEV")
public class DevServerConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public Bean_A beanA() {
		System.out.println("Environment is : "+env.getProperty("server.properties.name"));
		return new Bean_A();
	}
	
	@Bean
	public Bean_C beanC() {
		return new Bean_C();
	}
	
}
