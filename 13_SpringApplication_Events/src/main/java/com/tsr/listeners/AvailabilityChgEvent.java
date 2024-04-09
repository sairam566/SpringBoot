package com.tsr.listeners;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.AvailabilityState;
import org.springframework.context.ApplicationListener;

public class AvailabilityChgEvent implements ApplicationListener<AvailabilityChangeEvent<AvailabilityState>>{

	@Override
	public void onApplicationEvent(AvailabilityChangeEvent<AvailabilityState> event) {
		System.out.println("--------------------AvailabilityChangeEvent------Start--------------------");
		AvailabilityState state = event.getState();
		System.out.println(state.toString());
		System.out.println("--------------------AvailabilityChangeEvent------End--------------------");
	}
	
}
