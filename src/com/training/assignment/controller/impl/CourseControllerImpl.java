package com.training.assignment.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.training.assignment.controller.ConstraintViolationException;
import com.training.assignment.controller.CourseController;
import com.training.assignment.model.Course;
import com.training.assignment.model.Student;

public class CourseControllerImpl implements CourseController {

	private List<Course> courses = new ArrayList<>();

	@Override
	public void addCourse(Course course) {
		if (course.getName() == null || course.getName().isEmpty()) {
			throw new ConstraintViolationException("Course Name is empty");
		}
		if (courses.stream().anyMatch(e -> e.getId() == course.getId())) {
			throw new ConstraintViolationException("Duplicate Course ID:" + course.getId());
		}
		courses.add(course);
	}

	@Override
	public Course getCourseById(int id) {
		try {
			return courses.stream().findAny().filter(e -> e.getId() == id).get();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

}
