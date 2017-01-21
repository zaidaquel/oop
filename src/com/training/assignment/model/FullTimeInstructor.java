package com.training.assignment.model;

public class FullTimeInstructor extends Instructor {

	private double salary;

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double amountPayable() {
		return salary;
	}

}
