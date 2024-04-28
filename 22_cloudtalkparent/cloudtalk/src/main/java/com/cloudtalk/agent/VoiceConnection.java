package com.cloudtalk.agent;

public class VoiceConnection {
	
	protected String connectionValue;
	
	public VoiceConnection(String connectionValue) {
		super();
		this.connectionValue = connectionValue;
	}

	void connection(String dailNo) {
		System.out.println("dialing to :"+dailNo+" using connection :"+connectionValue);
	}
}
