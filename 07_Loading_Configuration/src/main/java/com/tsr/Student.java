package com.tsr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${rollNo}")
	protected int rollNo;
	
	@Value("${name}")
	protected String name;
	
	@Value("${homeRoomTeacher}")
	protected String homeRoomTeacher;
	
	@Value("${contactInfo}")
	protected String contactInfo;
	
	@Value("${randNo}")
	protected int randNo;

	public Student() {
		super();
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	public int getRandNo() {
		return randNo;
	}

	public void setRandNo(int randNo) {
		this.randNo = randNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", homeRoomTeacher=" + homeRoomTeacher
				+ ", contactInfo=" + contactInfo + ", randNo=" + randNo + "]";
	}

}
