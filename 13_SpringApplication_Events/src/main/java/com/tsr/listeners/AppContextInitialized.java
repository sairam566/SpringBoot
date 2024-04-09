package com.tsr.listeners;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

public class AppContextInitialized implements ApplicationListener<ApplicationContextInitializedEvent>{

	@Override
	public void onApplicationEvent(ApplicationContextInitializedEvent event) {
		
		System.out.println("--------------------ApplicationContextInitializedEvent-----------Start---------------");
		ConfigurableApplicationContext applicationContext = event.getApplicationContext();
		boolean active = applicationContext.isActive();
		System.out.println("ApplicationContext Is Active : "+active);
		int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
		System.out.println("Bean Count : "+beanDefinitionCount);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanNames : beanDefinitionNames) {
			//System.out.println(beanNames);
		}
		boolean running = applicationContext.isRunning();
		System.out.println("Is applicationContext Running "+running);
		System.out.println("--------------------ApplicationContextInitializedEvent---------End-----------------");
	}
	
}
