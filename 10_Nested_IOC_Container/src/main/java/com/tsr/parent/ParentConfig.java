package com.tsr.parent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tsr.beans.Rocket;

@Configuration
public class ParentConfig {

	@Bean
	public Rocket geRocket(@Value("${fuelType}") String fuelType, @Value("${capacity}") int capacity) {
		Rocket rocket = new Rocket(fuelType, capacity);
		return rocket;
	}
}
