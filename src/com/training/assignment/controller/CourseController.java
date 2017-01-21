package com.training.assignment.controller;

import com.training.assignment.model.Course;
import com.training.assignment.model.Student;

public interface CourseController {

	void addCourse(Course course);

	Course getCourseById(int i);

}
