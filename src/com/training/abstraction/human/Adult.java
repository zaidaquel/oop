package com.training.abstraction.human;

public class Adult extends Human {

	public Adult() {
		super();
	}

	public Adult(String name) {
		super(name);
	}

	public Adult(String name, int age) {
		super(name, age);
	}

	public void move(int numberOfMetersToMove) {
		System.out.println(name + "is running for " + numberOfMetersToMove);
	}

}
