package com.tsr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.tsr.event.EnvPreparedEvent;
import com.tsr.factory.YamlPropertySourceFactory;
import com.tsr.initilizer.YamlConfigApplicationContextInitializer;

@SpringBootApplication
@PropertySource(name = "teacher",value = "classpath:teacher.yml",factory = YamlPropertySourceFactory.class)
public class App {
	public static void main( String[] args )
    {
		ApplicationContext context = SpringApplication.run(App.class, args);
				
				
//				new SpringApplicationBuilder()
//    										.sources(App.class)
//    										.listeners(new EnvPreparedEvent())
//    										.initializers(new YamlConfigApplicationContextInitializer())
//    										.build()
//    										.run(args);
    	Student student = context.getBean(Student.class);
    	System.out.println(student);
    	Collage collage = context.getBean(Collage.class);
    	System.out.println(collage);
    	Teacher teacher = context.getBean(Teacher.class);
    	System.out.println(teacher);
    }
}
