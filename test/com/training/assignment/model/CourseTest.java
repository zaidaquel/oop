package com.training.assignment.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import com.training.assignment.CourseTestUtils;
import com.training.assignment.controller.ConstraintViolationException;

public class CourseTest {

	@Test
	public void givenValidStudentAndCourse_whenRegisterToCourse_thenSuccess() {
		CourseTestUtils.createStartedAndNotFinishedCourse().registerStudent(createStudent(1));
	}

	@Test(expected = ConstraintViolationException.class)
	public void givenValidStudentAndCourse_whenRegisterToCourseTwice_thenThrowConstraintViolationException() {
		Course course = CourseTestUtils.createStartedAndNotFinishedCourse();
		Student student = createStudent(1);
		course.registerStudent(student);
		course.registerStudent(student);
	}

	@Test
	public void givenActiveCourse_whenIsActive_thenReturnTrue() {
		assertTrue(CourseTestUtils.createStartedAndNotFinishedCourse().isActive());
	}

	@Test
	public void givenInactiveCourse_whenIsActive_thenReturnFalse() {
		assertFalse(CourseTestUtils.createFinishedCourse().isActive());
	}

	@Test
	public void givenNotStartedCourse_whenIsActive_thenReturnFalse() {
		assertFalse(CourseTestUtils.createFinishedCourse().isActive());
	}

	@Test
	public void givenCourseWith10StudentsAnd200RegsitrationFees_whenIncome_thenReturn2000() {
		Course course = CourseTestUtils.createFinishedCourse(1, "Java Level 1", 900, 200);
		for (int i = 0; i < 10; i++) {
			course.registerStudent(createStudent(i));
		}
		assertThat(course.income(), is(2000d));
	}

	@Test(expected = ConstraintViolationException.class)
	public void givenInvalidStudent_whenSetStudentMark_thenSuccess() {
		Course course = CourseTestUtils.createFinishedCourse();
		Student student = createStudent(1);
		course.setStudentMark(student, 70);
	}

	@Test
	public void givenCourseWith10StudentsAnd200RegsitrationFeesAnd600InstructorCheck_whenProfit_thenReturn1400() {
		Course course = CourseTestUtils.createFinishedCourse(1, "Java Level  1", 600, 200);
		for (int i = 0; i < 10; i++) {
			course.registerStudent(createStudent(i));
		}
		assertThat(course.profit(), is(1400d));
	}

	@Test
	public void givenValidStudent_whenSetStudentMark_thenSuccess() {
		Course course = CourseTestUtils.createFinishedCourse();
		Student student = createStudent(1);
		course.registerStudent(student);
		course.setStudentMark(student, 70);
	}

	@Test
	public void given10Student_whenAverageMarks_thenReturn0() {
		Course course = CourseTestUtils.createFinishedCourse();
		for (int i = 0; i < 10; i++) {
			course.registerStudent(createStudent(i));
		}
		assertThat(course.averageMarks(), is(0d));
	}

	@Test
	public void given10StudentAndSetMark50_whenAverageMarks_thenReturn50() {
		Course course = CourseTestUtils.createFinishedCourse();
		for (int i = 0; i < 10; i++) {
			Student student = createStudent(i);
			course.registerStudent(student);
			course.setStudentMark(student, 50);
		}
		assertThat(course.averageMarks(), is(50d));
	}

	private Student createStudent(int id) {
		Student student = new Student();
		student.setFirstName("Murad");
		student.setLastName("Ali");
		student.setId(id);
		return student;
	}

}
