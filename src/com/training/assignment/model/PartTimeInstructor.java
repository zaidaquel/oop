package com.training.assignment.model;

public class PartTimeInstructor extends Instructor {

	private double ratePerHour;
	private int workingHours;

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public double amountPayable() {
		return ratePerHour * workingHours;
	}

}
