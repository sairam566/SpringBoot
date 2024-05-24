package com.tsr.custom.actuator;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "jmsQueue")
public class JMSQueueManagmentEndpoint {
	
	@ReadOperation
	public int length(String queue) {
		System.out.println("Queue Name "+queue+" has Length : "+1);
		return 1;
	}
	
	@WriteOperation
	public boolean pause(String queue) {
		System.out.println("Queue Name "+queue+" has Paused : "+true);
		return true;
	}
	
	@DeleteOperation
	public boolean disabled(String queue) {
		System.out.println("Queue Name "+queue+" has disabled : "+true);
		return true;
	}
	
}
