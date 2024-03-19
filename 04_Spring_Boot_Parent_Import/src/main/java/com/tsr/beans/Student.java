package com.tsr.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${student.id}")
	protected int id;
	
	@Value("${student.name}")
	protected String name;
	
	@Value("${student.homeroomteacher}")
	protected String homeRoomTeacher;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String homeRoomTeacher) {
		super();
		this.id = id;
		this.name = name;
		this.homeRoomTeacher = homeRoomTeacher;
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

	public String getHomeRoomTeacher() {
		return homeRoomTeacher;
	}

	public void setHomeRoomTeacher(String homeRoomTeacher) {
		this.homeRoomTeacher = homeRoomTeacher;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", homeRoomTeacher=" + homeRoomTeacher + "]";
	}
	
}
