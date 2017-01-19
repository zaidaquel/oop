package com.training.vehicle.main;

import java.util.UUID;

import com.training.vehicle.model.Car;
import com.training.vehicle.model.Engine;
import com.training.vehicle.model.MotorCycle;
import com.training.vehicle.model.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		VehicleRunner runner = new VehicleRunner();

		System.out.println(runner.createBmw1200RsVehicleOwnedByEyad());
		System.out.println(runner.createHondaCivicVehicleOwnedByRami());
	}

	private Vehicle createHondaCivicVehicleOwnedByRami() {
		Vehicle car = new Car(getRandomString());
		car.setEngine(new Engine(1600, getRandomString()));
		car.setModel("Honda Civic");
		car.setOwnerName("Rami");
		return car;
	}

	private Vehicle createBmw1200RsVehicleOwnedByEyad() {
		Vehicle motorCycle = new MotorCycle(getRandomString());
		motorCycle.setEngine(new Engine(1170, getRandomString()));
		motorCycle.setModel("BMW 1200 RS");
		motorCycle.setOwnerName("Eyad");
		return motorCycle;
	}

	private String getRandomString() {
		return UUID.randomUUID().toString();
	}
}