package com.tsr.bo;

import java.sql.Date;

public class CustomerBO {

	protected int customerNo;
	protected String name;
	protected Date dob;
	protected String gender;

	public CustomerBO() {
		super();
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
		return "CustomerBO [customerNo=" + customerNo + ", name=" + name + ", dob=" + dob + ", gender=" + gender + "]";
	}

}
