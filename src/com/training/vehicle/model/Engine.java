package com.training.vehicle.model;

public class Engine {

	private int cc;
	private String engineNumber;
	private boolean started;

	public Engine(int cc, String engineNumber) {
		this.cc = cc;
		this.engineNumber = engineNumber;
	}

	public boolean isStarted() {
		return started;
	}

	public void start() {
		started = true;
	}

	public void stop() {
		started = false;
	}

	public int getCc() {
		return cc;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	@Override
	public int hashCode() {
		return engineNumber.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		if (engineNumber == null || other.engineNumber == null)
			return false;
		return engineNumber.equals(other.engineNumber);
	}

	@Override
	public String toString() {
		return "CC:" + getCc() + ",EngineNumber:" + getEngineNumber();
	}

}