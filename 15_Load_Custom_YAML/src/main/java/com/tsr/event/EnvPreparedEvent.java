package com.tsr.event;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

public class EnvPreparedEvent implements ApplicationListener<ApplicationEnvironmentPreparedEvent>{

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		
		YamlPropertySourceLoader loader = null;
		ClassPathResource classPathResource = null;
		ConfigurableEnvironment environment = null;
		MutablePropertySources propertySources = null;
		try {
			loader = new YamlPropertySourceLoader();
			classPathResource = new ClassPathResource("collage.yml");
			List<PropertySource<?>> load = loader.load("collageConfig", classPathResource);
			environment = event.getEnvironment();
			propertySources = environment.getPropertySources();
			for (PropertySource<?> propertySource : load) {
				propertySources.addLast(propertySource);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
