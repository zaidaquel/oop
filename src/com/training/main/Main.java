package com.training.main;

import com.training.abstraction.human.Adult;
import com.training.abstraction.human.Child;
import com.training.abstraction.human.Human;
import com.training.contract.calculator.Calculator;
import com.training.contract.calculator.SimpleCalculator;

public class Main {

	public static void main(String[] args) {
		Human zaid = new Child();
		zaid.setHeight(171);
		zaid.setWeight(80);
		zaid.setName("Zaid");
		zaid.move(10);
		// cast
		((Child) zaid).cry();

		Human rami = new Adult();
		rami.setHeight(175);
		rami.setWeight(75);
		rami.setName("Rami");
		rami.move(25);

		doCalculatorOperations(10, 50);
		doCalculatorOperations(15.6, 5.9);
	}

	public static void doCalculatorOperations(double n1, double n2) {
		Calculator calculator = new SimpleCalculator();
		double summation = calculator.sum(n1, n2);
		System.out.println("summation:" + summation);

		double multiplication = calculator.multiply(n1, n2);
		System.out.println("multiplication:" + multiplication);

		System.out.println("==============================");
	}

}
