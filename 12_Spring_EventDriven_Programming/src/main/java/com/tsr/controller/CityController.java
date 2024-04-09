package com.tsr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.tsr.event.ReloadCacheEvent;

@Component
public class CityController implements ApplicationEventPublisherAware {

	protected ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;

	}

	public void changeCity(String city, int id) {

		System.out.println(" Calling DB to change City");
		ReloadCacheEvent event = new ReloadCacheEvent(this, city);
		publisher.publishEvent(event);
		System.out.println("Updated successfully");
	}

}
