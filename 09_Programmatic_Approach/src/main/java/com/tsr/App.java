package com.tsr;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tsr.beans.Car;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.tsr" })
public class App {
	public static void main(String[] args) {
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder(App.class);
		applicationBuilder.bannerMode(Banner.Mode.OFF);
		SpringApplication application = applicationBuilder.build();
		ApplicationContext context = application.run(args);
		Car car = context.getBean(Car.class);
		car.start();
	}
}
