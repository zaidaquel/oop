package com.training.assignment.model;

public class Student {

	private String firstName;
	private String lastName;
	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	public int hashCode() {
		return Integer.valueOf(id).hashCode();
	}

	public boolean equals(Object other) {
		if (!(other instanceof Student)) {
			return false;
		}
		return Integer.valueOf(((Student) other).getId()).equals(Integer.valueOf(getId()));
	}

}
