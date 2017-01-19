package com.training.vehicle.model;

public abstract class Vehicle {

	private final String chaseNumber;
	private final int numberOfTires;
	private Engine engine;
	private String ownerName;
	private String model;

	public Vehicle(String chaseNumber, int numberOfTires) {
		this.chaseNumber = chaseNumber;
		this.numberOfTires = numberOfTires;
	}

	public abstract void drive();

	public abstract void brake();

	protected abstract String getVehicleDescription();

	public void startEngine() {
		engine.start();
	}

	public void stopEngine() {
		engine.stop();
	}

	public int getNumberOfTires() {
		return numberOfTires;
	}

	public String getChaseNumber() {
		return chaseNumber;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	protected void checkEngineStatus() {
		if (!getEngine().isStarted()) {
			throw new VehicleOperationException("Engine is not started");
		}
	}

	public String toString() {
		return getVehicleDescription() + " chaseNumber:" + getChaseNumber() + ", Owner Name:" + getOwnerName()
				+ ", Model: " + getModel() + ",Engine: [" + getEngine() + "]";
	}
}