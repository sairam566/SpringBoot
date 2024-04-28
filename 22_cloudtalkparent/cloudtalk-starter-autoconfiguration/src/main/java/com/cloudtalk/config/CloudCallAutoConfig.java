package com.cloudtalk.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudtalk.agent.CloudCall;
import com.cloudtalk.server.CloudTalkServer;

@Configuration
@ConditionalOnBean(name = {"cloudTalkServer"})
@AutoConfigureAfter(value = {CloudTalkServerAutoConfig.class})
public class CloudCallAutoConfig {
	
	@Bean
	public CloudCall cloudCall(CloudTalkServer cloudTalkServer) {
		CloudCall call = new CloudCall();
		call.setCloudTalkServer(cloudTalkServer);
		return call;
	}
}
