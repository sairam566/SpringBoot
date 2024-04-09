package com.tsr.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.tsr.event.ReloadCacheEvent;

@Component
public class ReloadCacheListener implements ApplicationListener<ReloadCacheEvent>{

	@Override
	public void onApplicationEvent(ReloadCacheEvent event) {
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Listner got called with Key : "+event.getKey());
	}
	
}
