package com.tsr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.tsr.listeners.AppContextInitialized;
import com.tsr.listeners.AppFailedEvent;
import com.tsr.listeners.AppPreparedEvent;
import com.tsr.listeners.AppReadyEvent;
import com.tsr.listeners.AppStartEvent;
import com.tsr.listeners.AppStartedEvent;
import com.tsr.listeners.AvailabilityChgEvent;
import com.tsr.listeners.CtxRefreshEvent;
import com.tsr.listeners.EnvPreparedEvent;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder().sources(App.class)
				.listeners(new AppStartEvent(), new EnvPreparedEvent(), new AppContextInitialized(),
						new AppPreparedEvent(), new AppStartedEvent(), new AvailabilityChgEvent(), new AppReadyEvent(),
						new AppFailedEvent(),new CtxRefreshEvent())
				.build().run(args);
	}

	//@Bean
	public CommandLineRunner runner() {
//		return new CommandLineRunner() {
//
//			@Override
//			public void run(String... args) throws Exception {
//				throw new Exception("From Command Line Runner");
//			}
//		};
		return (args)->{
			throw new Exception("From Command Line Runner");
		};
	}
}
