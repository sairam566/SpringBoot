package com.tsr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.quickconnect.panel.ControlPanel;

@SpringBootApplication
@ComponentScan(basePackages = {"com.quickconnect.panel"})
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = SpringApplication.run(App.class, args);
        ControlPanel panel = context.getBean(ControlPanel.class);
        panel.initiate("D:sai/phone.xls");
    }
}
