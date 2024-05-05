package com.tsr.dto;

import java.sql.Date;

public class CustomerDto {

	protected int customerNo;
	protected String name;
	protected Date dob;
	protected String gender;

	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerNo=" + customerNo + ", name=" + name + ", dob=" + dob + ", gender=" + gender + "]";
	}

}
