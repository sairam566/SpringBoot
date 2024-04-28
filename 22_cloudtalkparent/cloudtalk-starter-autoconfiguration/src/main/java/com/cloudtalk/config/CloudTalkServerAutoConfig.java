package com.cloudtalk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.cloudtalk.server.CloudTalkServer;

@Configuration
@ConditionalOnClass(value = { CloudTalkServer.class })
public class CloudTalkServerAutoConfig {

	@Autowired
	Environment environment;

	public CloudTalkServerAutoConfig() {
		super();
		System.out.println("Auto Configuration Object is created ");
	}

	@Bean
	public CloudTalkServer cloudTalkServer() {
		CloudTalkServer cloudTalkServer = new CloudTalkServer();
		cloudTalkServer.setCloudTalkServerAddress(environment.getProperty("cloudtalk.server-address"));
		cloudTalkServer.setAgentName(environment.getProperty("cloudtalk.agent"));
		cloudTalkServer.setAuthorizationCode(environment.getProperty("cloudtalk.authorization-code"));
		return cloudTalkServer;
	}

}
