package com.training.language.basics;

public class LanguageBasics2 {

	public static void main(String[] args) {
		useImport();
	}

	private static void controlFlow1() {
		// What is the output of the below?

		// 1)
		// double taxAmount = 400;
		// if (taxAmount > 600) {
		// System.out.println("Tax Amount > 600");
		// } else if (taxAmount > 500) {
		// System.out.println("Tax Amount > 500");
		// }
		//
		// System.out.println("End of ControlFlow1");

		// 2)
		double taxAmount = 4000;
		if (taxAmount > 600) {
			System.out.println("Tax Amount > 600");
		} else if (taxAmount > 500) {
			System.out.println("Tax Amount > 500");
		} else {
			System.out.println("Tax Amount is too low");
		}

		System.out.println("End of ControlFlow1");
	}

	private static void controlFlow2() {
		int numberOfStudents = 10;
		double sum = 0;
		for (int i = 0; i < numberOfStudents; i++) {
			sum += (Math.random() * 100); // Same of sum = sum + (Math.random()
											// * 100);
		}

		double average = sum / numberOfStudents;
		System.out.println("Result=" + average);
	}

	private static void controlFlow3() {
		int numberOfStudents = 10;
		double sum = 0;
		int i = 0;
		while (i++ < numberOfStudents) {
			if (i == 5) {
				continue;
			}
			sum += (Math.random() * 100);
			System.out.println("Working " + i);
		}
		double average = sum / numberOfStudents;
		System.out.println("Result=" + average);
	}

	private static void useImport() {
	}
}