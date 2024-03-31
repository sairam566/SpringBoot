package com.tsr.beans;

//Imagine No Source Code
public class Rocket {
	protected String fuelType;
	protected int capacity;

	public Rocket() {
		super();
	}

	public Rocket(String fuelType, int capacity) {
		super();
		this.fuelType = fuelType;
		this.capacity = capacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Rocket [fuelType=" + fuelType + ", capacity=" + capacity + "]";
	}
}
