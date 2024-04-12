package com.tsr;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "teacher")
public class Teacher {
	protected int id;
	protected String name;
	protected String qualification;

	public Teacher() {
		super();
	}

	public Teacher(int id, String name, String qualification) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", qualification=" + qualification + "]";
	}

}
