package com.training.language.basics;

import java.util.ArrayList;

public class PrimitiveTypes {

	public static void main(String[] args) {
		arrayExample1();
	}

	public static void primitivesOne() {
		// Do any of the below accept null value?
		// float f1 = null;
		byte b1 = -128;// 8
		short s1 = 1000;// 16
		int i1 = 1000000000;// 32
		long l1 = 1000000000000000000L;// 64

		float f1 = 1155.2f; // 32
		double d1 = 1155.2; // 64

		char c1 = 'A';

		// does it compile?
		// char c2 = "XYZ";
		// char c3 = "X";
		// char c4 = 60;
		// char c5 = null;
		// int i1 = null;
		// String str = null;

		boolean bool = true;
	}

	private static void stringOne() {
		String string1 = "Hello Java";
	}

	private static void arrayExample1() {
		int[] myFirstArray = { 1, 2, 3, 4 };

		int[] mySecondArray = new int[4];
		mySecondArray[2] = 10;
		mySecondArray[1] = 8;

		// What is the result?
		// System.out.println(myFirstArray);
		// myFirstArray[5] = 10;
		// myFirstArray[1] = 10;
		// myFirstArray[0] = "Hello";
		// int[] mySecondArray = new int[];

		// int[] mySecondArray;
		// mySecondArray = new int[];
	}

	private static void arrayListExample1() {
		ArrayList<String> names = new ArrayList<>(3);
		names.add("Sami");
		names.add("Ali");
		names.add("Rami");
		names.add("Maher");
		System.out.println("Names=" + names);
		System.out.println("Size=" + names.size());

		names.remove("Rami");
		System.out.println("Names=" + names);
		System.out.println("Size=" + names.size());
	}
}