package com.training.language.basics;

public class LanguageBasics1 {

	public static void main(String[] args) {
		operators();
	}

	private static void operators() {
		int x = 5;
		int y = 10;
		x = y;
		long result = y + 2 * (x + y) - x;
		System.out.println("result=" + result);

		boolean b = y == x;
		System.out.println("result=" + b);

		int i = 0;
		System.out.println("result=" + (++i));
		System.out.println("result=" + (i));
	}

	private static void variables() {
		// Does the below items work?

		// 1)
		// int numberOne = 120.5;

		// 2)
		// int numberTwo = 5;
		// numberTwo = 2;

		// 3)
		// final int number = 10;
		// number = 15;

		// 4)
		// int numberOne;

		// 5)
		// final int numberOne;

		// 6)
		// int numberOne = 1;
		// int numberOne = 2;

		// 7)
		// int 1Number = 10;

		// 8)
		// long numberThree = 10;
		// {
		// long numberThree = 10;
		// }

		// 9)
		// {
		// long numberThree = 10;
		// }
		// long numberThree = 10;
	}

}
