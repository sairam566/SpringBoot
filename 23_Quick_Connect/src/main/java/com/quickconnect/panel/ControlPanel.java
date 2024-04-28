package com.quickconnect.panel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cloudtalk.agent.CloudCall;

@Component
public class ControlPanel {
	
	@Autowired
	private CloudCall call;
	
	public void initiate(String leadFilelocation) {
		call.dial("785421369");
	}
}
