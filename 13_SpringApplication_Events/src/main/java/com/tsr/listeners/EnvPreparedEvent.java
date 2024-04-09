package com.tsr.listeners;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;

public class EnvPreparedEvent implements ApplicationListener<ApplicationEnvironmentPreparedEvent>{

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		System.out.println("--------------------ApplicationEnvironmentPreparedEvent--------------------------");
		ConfigurableEnvironment environment = event.getEnvironment();
		System.out.println(environment.getClass().getCanonicalName());
		System.out.println(environment.getRequiredProperty("app.name"));
		System.out.println("--------------------ApplicationEnvironmentPreparedEvent----End-------------------------");
	}
	
}
