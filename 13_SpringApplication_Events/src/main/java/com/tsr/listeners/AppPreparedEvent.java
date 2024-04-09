package com.tsr.listeners;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import com.tsr.beans.Collage;
import com.tsr.beans.Student;

public class AppPreparedEvent implements ApplicationListener<ApplicationPreparedEvent>{

	@Override
	public void onApplicationEvent(ApplicationPreparedEvent event) {
		
		System.out.println("--------------------ApplicationPreparedEvent------Start--------------------");
		
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
		System.out.println("--------------------ApplicationPreparedEvent-----End---------------------");
	}
	
}
