package com.training.vehicle.model;

public class MotorCycle extends Vehicle {

	public MotorCycle(String chaseNumber) {
		super(chaseNumber, 2);
	}

	public void drive() {
		checkEngineStatus();
		System.out.println("Driving MotorCycle");
	}

	public void brake() {
		checkEngineStatus();
		System.out.println("Slowdown MotorCycle");
	}

	protected String getVehicleDescription() {
		return "MotorCycle";
	}

}