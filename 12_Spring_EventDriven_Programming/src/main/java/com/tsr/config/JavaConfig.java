package com.tsr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
@ComponentScan(basePackages = {"com.tsr.controller","com.tsr.listener"})
public class JavaConfig {
	
	//Uncomment below Bean definition if you want to publish events asynchronously
	
//	@Bean(name = "applicationEventMulticaster")
//    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
//        SimpleApplicationEventMulticaster eventMulticaster =
//          new SimpleApplicationEventMulticaster();
//        
//        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
//        return eventMulticaster;
//    }

}
