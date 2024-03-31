package com.tsr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tsr.beans.Launcher;
import com.tsr.beans.Rocket;
import com.tsr.parent.ParentConfig;

@SpringBootApplication
public class App {

	@Bean
	public Launcher launcher(@Value("${launchPad}") int launchPad, Rocket rocket) {
		Launcher launcher = new Launcher(launchPad, rocket);
		return launcher;
	}

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder();
		builder = builder.parent(ParentConfig.class).sources(App.class);
		SpringApplication application = builder.build();
		ApplicationContext context = application.run(args);
		Launcher launch = context.getBean(Launcher.class);
		System.out.println(launch);
	}
}
