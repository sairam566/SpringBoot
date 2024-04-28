package com.cloudtalk.agent;

import com.cloudtalk.server.CloudTalkServer;

public class CloudCall {
	
	protected CloudTalkServer cloudTalkServer;

	public void setCloudTalkServer(CloudTalkServer cloudTalkServer) {
		this.cloudTalkServer = cloudTalkServer;
	}
	
	public int dial(String dialNo) {
		int status=0;
		VoiceConnection connection = cloudTalkServer.init();
		connection.connection(dialNo);
		return status;
	}
}
