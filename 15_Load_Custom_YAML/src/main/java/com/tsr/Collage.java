package com.tsr;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "collage")
public class Collage {

	protected String name;
	protected int establishedYear;

	public Collage() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEstablishedYear() {
		return establishedYear;
	}

	public void setEstablishedYear(int establishedYear) {
		this.establishedYear = establishedYear;
	}

	@Override
	public String toString() {
		return "Collage [name=" + name + ", establishedYear=" + establishedYear + "]";
	}

}
