package com.tsr.initilizer;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

public class YamlConfigApplicationContextInitializer
		implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		YamlPropertySourceLoader loader = null;
		ConfigurableEnvironment environment = null;
		List<PropertySource<?>> listSources = null;

		try {
			loader = new YamlPropertySourceLoader();
			listSources = loader.load("config", applicationContext.getResource("classpath:student.yml"));
			environment = applicationContext.getEnvironment();
			for (PropertySource<?> propertySource : listSources) {
				environment.getPropertySources().addLast(propertySource);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
