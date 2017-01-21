package com.training.assignment.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import com.training.assignment.controller.impl.StudentControllerImpl;
import com.training.assignment.model.Student;

public class StudentControllerTest {

	@Test
	public void givenValidStudent_whenAdd_thenSuccess() {
		StudentController studentController = new StudentControllerImpl();
		studentController.addStudent(createStudent(1, "Ramez", "Romel"));
	}

	@Test(expected = ConstraintViolationException.class)
	public void givenStudentWithDuplicateId_whenAdd_thenThrowConstraintViolationException() {
		StudentController studentController = new StudentControllerImpl();
		studentController.addStudent(createStudent(1, "Zaid", "Romel"));
		studentController.addStudent(createStudent(1, "Zaid", "Romel"));
	}

	@Test(expected = ConstraintViolationException.class)
	public void givenStudentWithEmptyFirstName_whenAdd_thenThrowConstraintViolationException() {
		StudentController studentController = new StudentControllerImpl();
		studentController.addStudent(createStudent(1, null, "Romel"));
	}

	@Test(expected = ConstraintViolationException.class)
	public void givenStudentWithEmptyLastName_whenAdd_thenThrowConstraintViolationException() {
		StudentController studentController = new StudentControllerImpl();
		studentController.addStudent(createStudent(1, "Ramez", null));
	}

	@Test
	public void givenValidStudentId__whenGetStudentById_thenReturnStudent() {
		StudentController studentController = new StudentControllerImpl();
		studentController.addStudent(createStudent(1, "Ramez", "Romel"));
		assertThat(studentController.getStudentById(1).getId(), is(1));
	}

	private Student createStudent(int id, String firstName, String lastName) {
		Student student = new Student();
		student.setId(id);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		return student;
	}

}
