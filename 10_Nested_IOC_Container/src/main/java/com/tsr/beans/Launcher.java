package com.tsr.beans;

//Imagine No Source Code
public class Launcher {
	protected int launchPad;
	protected Rocket rocket;
	
	public Launcher() {
		super();
	}

	public Launcher(int launchPad, Rocket rocket) {
		super();
		this.launchPad = launchPad;
		this.rocket = rocket;
	}

	public int getLaunchPad() {
		return launchPad;
	}

	public void setLaunchPad(int launchPad) {
		this.launchPad = launchPad;
	}

	public Rocket getRocket() {
		return rocket;
	}

	public void setRocket(Rocket rocket) {
		this.rocket = rocket;
	}

	@Override
	public String toString() {
		return "Launcher [launchPad=" + launchPad + ", rocket=" + rocket + "]";
	}
	
}
