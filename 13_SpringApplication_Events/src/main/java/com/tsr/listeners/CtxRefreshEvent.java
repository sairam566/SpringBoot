package com.tsr.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class CtxRefreshEvent implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("--------------------ContextRefreshedEvent------Start--------------------");
		System.out.println("--------------------ContextRefreshedEvent------End--------------------");
	}
}
