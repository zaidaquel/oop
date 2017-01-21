package com.training.assignment.controller;

import com.training.assignment.model.Instructor;

public interface InstructorController {

	void addInstructor(Instructor createInstructor);

	Instructor getInstructorById(int id);

}
