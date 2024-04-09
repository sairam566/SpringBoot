package com.tsr.listeners;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class AppFailedEvent implements ApplicationListener<ApplicationFailedEvent>{

	@Override
	public void onApplicationEvent(ApplicationFailedEvent event) {
		System.out.println("--------------------ApplicationFailedEvent------Start--------------------");
		Throwable exception = event.getException();
		System.out.println("From \n");
		exception.printStackTrace();
		System.out.println("--------------------ApplicationFailedEvent------End--------------------");
	}
	
}
