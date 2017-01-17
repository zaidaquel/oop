package com.training.abstraction.human;

public abstract class Human {

	/**
	 * static / class variables
	 */
	private static int createdObjectsCount = 0;

	/**
	 * Attributes / instance variables
	 */
	private int height;
	private int weight;
	private int age;
	String name;

	public Human() {
		createdObjectsCount++;
	}

	protected Human(String name) {
		this();
		this.name = name;
	}

	protected Human(String name, int age) {
		this(name);
		this.age = age;
	}

	/**
	 * Static Methods
	 */

	public static int getCreatedObjectsCount() {
		return createdObjectsCount;
	}

	/**
	 * Instance Methods / Behavior
	 * 
	 */

	/**
	 * Abstract: knows what to do, but does not know how to do it. Abstract
	 * methods do not have implementation / body. If a class has Abstract
	 * method, it must be abstract
	 */
	public abstract void move(int numberOfMetersToMove);

	public void printName() {
		System.out.println("Name is " + name);
	}

	public void printHeight() {
		System.out.println("Height is " + height);
	}

	public boolean isTall() {
		return height > 179;
	}

	public boolean isOverweight() {
		return weight > 85;
	}

	public boolean isYouth() {
		return age >= 15 && age <= 24;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name is " + name + ", age is " + age + ", height is " + height + " and weight is " + weight;
	}

}