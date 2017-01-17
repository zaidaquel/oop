package com.training.contract.calculator;

public class SimpleCalculator implements Calculator {

	@Override
	public double sum(double numberOne, double numberTwo) {
		return numberOne + numberTwo;
	}

	@Override
	public double multiply(double numberOne, double numberTwo) {
		double result = numberOne * numberTwo;
		return result;
	}

}
