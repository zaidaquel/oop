package com.training.vehicle.model;

public class Car extends Vehicle {

	private static int numberOfCarsCreated;

	public static int getNumberOfCarsCreated() {
		return numberOfCarsCreated;
	}

	public Car(String chaseNumber) {
		super(chaseNumber, 4);
		numberOfCarsCreated++;
	}

	public void drive() {
		checkEngineStatus();
		System.out.println("Driving Car");
	}

	@Override
	public void brake() {
		checkEngineStatus();
		System.out.println("Slowdown Car");
	}

	public void drift() {
		checkEngineStatus();
		System.out.println("Drifting");
	}

	protected String getVehicleDescription() {
		return "Car";
	}

}
