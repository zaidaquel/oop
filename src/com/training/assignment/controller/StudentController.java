package com.training.assignment.controller;

import com.training.assignment.model.Student;

public interface StudentController {

	void addStudent(Student student);

	Student getStudentById(int id);

}
