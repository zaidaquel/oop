package com.training.assignment.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.training.assignment.controller.ConstraintViolationException;
import com.training.assignment.controller.InstructorController;
import com.training.assignment.model.Instructor;

public class InstructorControllerImpl implements InstructorController {

	private List<Instructor> instructors = new ArrayList<>();;

	@Override
	public void addInstructor(Instructor instructor) {
		if (instructors.stream().anyMatch(e -> e.getId() == instructor.getId())) {
			throw new ConstraintViolationException("Duplicate ID:" + instructor.getId());
		}

		if (instructor.getFirstName() == null || instructor.getFirstName().isEmpty()) {
			throw new ConstraintViolationException("Empty First Name");
		}

		if (instructor.getLastName() == null || instructor.getLastName().isEmpty()) {
			throw new ConstraintViolationException("Empty Last Name");
		}

		instructors.add(instructor);
	}

	@Override
	public Instructor getInstructorById(int id) {
		try {
			return instructors.stream().findAny().filter(e -> e.getId() == id).get();
		} catch (NoSuchElementException exp) {
			return null;
		}
	}

}
