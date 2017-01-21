package com.training.assignment.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.training.assignment.controller.impl.InstructorControllerImpl;
import com.training.assignment.model.FullTimeInstructor;
import com.training.assignment.model.Instructor;

public class InstructorControllerTest {

	@Test
	public void givenValidInstructor_whenAdd_thenSuccess() {
		InstructorController instructorController = new InstructorControllerImpl();
		instructorController.addInstructor(createInstructor(1, "Tamer", "Mohammad"));
	}

	@Test(expected = ConstraintViolationException.class)
	public void givenInstructorWithEmptyFirstName_whenAdd_thenThrowConstraintViolationException() {
		InstructorController instructorController = new InstructorControllerImpl();
		instructorController.addInstructor(createInstructor(1, null, "Mohammad"));
	}

	@Test(expected = ConstraintViolationException.class)
	public void givenInstructorWithEmptyLastName_whenAdd_thenThrowConstraintViolationException() {
		InstructorController instructorController = new InstructorControllerImpl();
		instructorController.addInstructor(createInstructor(1, "Tamer", null));
	}

	@Test(expected = ConstraintViolationException.class)
	public void givenDuplicateInstructor_whenAdd_thenThrowConstraintViolationException() {
		InstructorController instructorController = new InstructorControllerImpl();
		instructorController.addInstructor(createInstructor(2, "Tamer", "Mohammad"));
		instructorController.addInstructor(createInstructor(2, "Rami", "Samer"));
	}

	@Test
	public void givenValidInstructorId_whenGetInstructor_thenReturnInstructor() {
		InstructorController instructorController = new InstructorControllerImpl();
		instructorController.addInstructor(createInstructor(1, "Tamer", "Mohammad"));
		Instructor instructor = instructorController.getInstructorById(1);
		assertNotNull(instructor);
		assertEquals(instructor.getId(), 1);
	}

	@Test
	public void givenInvalidInstructorId_whenGetInstructor_thenReturnNull() {
		InstructorController instructorController = new InstructorControllerImpl();
		assertNull(instructorController.getInstructorById(10));
	}

	private Instructor createInstructor(int id, String firstName, String lastName) {
		Instructor instructor = new FullTimeInstructor();
		instructor.setId(id);
		instructor.setFirstName(firstName);
		instructor.setLastName(lastName);
		return instructor;
	}
}