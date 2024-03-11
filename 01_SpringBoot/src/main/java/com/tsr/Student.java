package com.tsr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${stu.roleno}")
	protected int rollNo;
	
	@Value("${stu.name}")
	protected String name;

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

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}
