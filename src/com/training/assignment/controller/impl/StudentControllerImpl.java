package com.training.assignment.controller.impl;

import java.util.ArrayList;
import java.util.List;

import com.training.assignment.controller.ConstraintViolationException;
import com.training.assignment.controller.StudentController;
import com.training.assignment.model.Student;

public class StudentControllerImpl implements StudentController {

	private List<Student> students = new ArrayList<>();

	public void addStudent(Student student) {
		if (student.getFirstName() == null || student.getFirstName().isEmpty()) {
			throw new ConstraintViolationException("Empty First Name");
		}

		if (student.getLastName() == null || student.getLastName().isEmpty()) {
			throw new ConstraintViolationException("Empty Last Name");
		}

		if (students.stream().anyMatch(e -> e.getId() == student.getId())) {
			throw new ConstraintViolationException("Duplicate Student ID:" + student.getId());
		}
		students.add(student);
	}

	public Student getStudentById(int id) {
		return students.stream().findAny().filter(e -> e.getId() == id).get();
	}

}
