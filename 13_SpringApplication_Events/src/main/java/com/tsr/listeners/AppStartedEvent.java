package com.tsr.listeners;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import com.tsr.beans.Student;

public class AppStartedEvent implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		
		System.out.println("--------------------ApplicationStartedEvent------Start--------------------");
		
		ConfigurableApplicationContext applicationContext = event.getApplicationContext();
		boolean active = applicationContext.isActive();
		System.out.println(" ApplicationContext Is Active : "+active);
		int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
		System.out.println("Bean Count : "+beanDefinitionCount);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanNames : beanDefinitionNames) {
			//System.out.println(beanNames);
		}
		boolean running = applicationContext.isRunning();
		System.out.println("Is applicationContext Running  "+running);
		Student bean = applicationContext.getBean(Student.class);
		System.out.println("Student Bean : "+bean);
		System.out.println("--------------------ApplicationStartedEvent------End--------------------");
	}
	
}
