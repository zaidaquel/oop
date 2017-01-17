package com.training.abstraction.human;

public class Child extends Human {

	public Child() {
		super();
	}

	public Child(String name) {
		super(name);
	}

	public Child(String name, int age) {
		super(name, age);
	}

	public void move(int numberOfMetersToMove) {
		System.out.println(super.name + " is crawling for " + numberOfMetersToMove);
	}

	public void cry() {
		System.out.println(super.name + " is crying");
	}

}