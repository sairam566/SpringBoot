package com.tsr.listeners;

import java.time.Duration;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

public class AppReadyEvent implements ApplicationListener<ApplicationReadyEvent>{

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		System.out.println("--------------------ApplicationReadyEvent------Start--------------------");
		Duration timeTaken = event.getTimeTaken();
		System.out.println("Time Taken to Start Application : "+timeTaken.toSeconds());
		System.out.println("--------------------ApplicationReadyEvent------End--------------------");
	}
	
}
