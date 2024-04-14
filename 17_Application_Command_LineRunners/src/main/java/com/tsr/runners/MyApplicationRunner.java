package com.tsr.runners;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("-----------ApplicationArguments Start----------------------");
		System.out.println("-----------ApplicationArguments Non Option Args----------------------");
		
		List<String> nonOptionArgs = args.getNonOptionArgs();
		for (String arg : nonOptionArgs) {
			System.out.println(arg);
		}
		
		System.out.println("-----------ApplicationArguments Option Args----------------------");
		Set<String> optionNames = args.getOptionNames();
		for (String optName : optionNames) {
			System.out.println(optName+" "+args.getOptionValues(optName));
		}
		
		
		System.out.println("-----------ApplicationArguments End----------------------");
	}
	
}
