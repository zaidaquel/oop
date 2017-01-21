package com.training.assignment.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.training.assignment.CourseTestUtils;
import com.training.assignment.controller.impl.CourseControllerImpl;

public class CourseControllerTest {

	@Test
	public void givenValidCourse_whenAdd_thenSuccess() {
		CourseController courseController = new CourseControllerImpl();
		courseController.addCourse(CourseTestUtils.createStartedAndNotFinishedCourse());
	}

	@Test(expected = ConstraintViolationException.class)
	public void givenCourseWithDuplicateId_whenAdd_thenThrowConstraintViolationException() {
		CourseController courseController = new CourseControllerImpl();
		courseController.addCourse(CourseTestUtils.createStartedAndNotFinishedCourse());
		courseController.addCourse(CourseTestUtils.createStartedAndNotFinishedCourse());
	}

	@Test(expected = ConstraintViolationException.class)
	public void givenCourseWithEmptyName_whenAdd_thenThrowConstraintViolationException() {
		CourseController courseController = new CourseControllerImpl();
		courseController.addCourse(CourseTestUtils.createStartedAndNotFinishedCourse(1, null, 600d, 200));
	}

	@Test
	public void givenValidCourseId_whenGetCourseById_thenReturnCourse() {
		CourseController courseController = new CourseControllerImpl();
		courseController.addCourse(CourseTestUtils.createStartedAndNotFinishedCourse());
		assertThat(courseController.getCourseById(1).getId(), is(1));
	}

	@Test
	public void givenInvalidCourseId_whenGetCourseById_thenReturnNull() {
		CourseController courseController = new CourseControllerImpl();
		assertNull(courseController.getCourseById(1));
	}

}