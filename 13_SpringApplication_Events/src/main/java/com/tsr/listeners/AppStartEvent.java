package com.tsr.listeners;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class AppStartEvent implements ApplicationListener<ApplicationStartingEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("--------------------ApplicationStartingEvent-------------------------");
		String[] args = event.getArgs();
		System.out.println("Arguments : \n");
		for (String arg : args) {
			//System.out.println(arg);
		}
		System.out.println("---------------------ApplicationStartingEvent-----End-----------------------");
	}
	
}
