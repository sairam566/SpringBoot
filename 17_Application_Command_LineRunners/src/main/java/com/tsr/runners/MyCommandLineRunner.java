package com.tsr.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----------CommandLineRunnerStart-----------------");
		for (String string : args) {
			System.out.println(string);
		}
		System.out.println("-----------CommandLineRunnerEnd-------------------");
	}
	
}
