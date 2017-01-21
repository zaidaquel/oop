package com.training.assignment;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import com.training.assignment.model.Course;
import com.training.assignment.model.FullTimeInstructor;
import com.training.assignment.model.Instructor;

public class CourseTestUtils {

	public static Course createStartedAndNotFinishedCourse() {
		return createStartedAndNotFinishedCourse(1, "Java Level 1", 400, 200);
	}

	public static Course createStartedAndNotFinishedCourse(int id, String name, double instructorCheck,
			double registrationFees) {
		return createCourse(id, name, instructorCheck, LocalDate.now().minus(1, ChronoUnit.DAYS), registrationFees);
	}

	public static Course createNotStartedCourse() {
		return createFinishedCourse(1, "Java Level 1", 400, 200);
	}

	public static Course createNotStarted(int id, String name, double instructorCheck, double registrationFees) {
		return createCourse(id, name, instructorCheck, LocalDate.now().plus(2, ChronoUnit.MONTHS), registrationFees);
	}

	public static Course createFinishedCourse() {
		return createFinishedCourse(1, "Java Level 1", 400, 200);
	}

	public static Course createFinishedCourse(int id, String name, double instructorCheck, double registrationFees) {
		return createCourse(id, name, instructorCheck, LocalDate.now().minus(2, ChronoUnit.MONTHS), registrationFees);
	}

	private static Course createCourse(int id, String name, double instructorCheck, LocalDate startDate,
			double registrationFees) {
		Course course = new Course();
		course.setId(id);
		course.setName(name);
		course.setInstructor(createInstructor());
		course.setStartDate(dateFromLocalDate(startDate));
		course.setEndDate(dateFromLocalDate(startDate.plus(1, ChronoUnit.MONTHS)));
		course.setInstructorCheck(instructorCheck);
		course.setRegistrationFees(registrationFees);
		return course;
	}

	private static Instructor createInstructor() {
		Instructor instructor = new FullTimeInstructor();
		instructor.setFirstName("Murad");
		instructor.setLastName("Ali");
		instructor.setId(1);
		return instructor;
	}

	private static Date dateFromLocalDate(LocalDate now) {
		return Date.from(now.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

}