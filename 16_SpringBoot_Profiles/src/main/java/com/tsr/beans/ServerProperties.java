package com.tsr.beans;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "server")
public class ServerProperties {

	protected Map<String, String> properties;
	protected Map<String, List<String>> config;
	protected Map<String, Credentials> credentials;

	public static class Credentials {
		protected String username;
		protected String password;

		public Credentials() {
			super();
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Credentials [username=" + username + ", password=" + password + "]";
		}

	}

	public ServerProperties() {
		super();
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public Map<String, List<String>> getConfig() {
		return config;
	}

	public void setConfig(Map<String, List<String>> config) {
		this.config = config;
	}

	public Map<String, Credentials> getCredentials() {
		return credentials;
	}

	public void setCredentials(Map<String, Credentials> credentials) {
		this.credentials = credentials;
	}

	@Override
	public String toString() {
		return "DevServerProperties [ \n properties=" + properties + ",\n config=" + config + ",\n credentials=" + credentials
				+ "\n]";
	}
	
}
