package com.cloudtalk.server;

import com.cloudtalk.agent.VoiceConnection;

public class CloudTalkServer {

	protected String cloudTalkServerAddress;
	protected String agentName;
	protected String authorizationCode;

	public VoiceConnection init() {
		VoiceConnection connection = new VoiceConnection(
				cloudTalkServerAddress + "//" + agentName + ":" + authorizationCode);
		return connection;
	}

	public String getCloudTalkServerAddress() {
		return cloudTalkServerAddress;
	}

	public void setCloudTalkServerAddress(String cloudTalkServerAddress) {
		this.cloudTalkServerAddress = cloudTalkServerAddress;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	@Override
	public String toString() {
		return "CloudTalkServer [cloudTalkServerAddress=" + cloudTalkServerAddress + ", agentName=" + agentName
				+ ", authorizationCode=" + authorizationCode + "]";
	}

}
