package com.tsr.events;

import org.springframework.boot.ExitCodeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ExitEvent implements ApplicationListener<ExitCodeEvent>{

	@Override
	public void onApplicationEvent(ExitCodeEvent event) {
		System.out.println("Application Exit Code : "+event.getExitCode());
	}

}
