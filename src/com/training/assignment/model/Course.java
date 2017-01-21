package com.training.assignment.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.assignment.controller.ConstraintViolationException;

public class Course {

	private Date endDate;
	private Date startDate;
	private Instructor instructor;
	private String name;
	private int id;
	private double passingMark;
	private double instructorCheck;
	private List<Student> students = new ArrayList<>();
	private double registrationFees;
	private Map<Student, Double> studentMarks = new HashMap<>();

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setInstructorCheck(double instructorCheck) {
		this.instructorCheck = instructorCheck;

	}

	public void setPassingMark(double passingMark) {
		this.passingMark = passingMark;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void registerStudent(Student student) {
		if (students.stream().anyMatch(e -> e.getId() == student.getId())) {
			throw new ConstraintViolationException("Duplicate Student ID:" + student.getId());
		}
		students.add(student);
	}

	public boolean isActive() {
		Date now = new Date();
		return (now.after(startDate) || now.equals(startDate)) && (now.before(endDate) || now.equals(endDate));
	}

	public void setRegistrationFees(double registrationFees) {
		this.registrationFees = registrationFees;

	}

	public double income() {
		return students.size() * registrationFees;
	}

	public double profit() {
		return income() - instructorCheck;
	}

	public void setStudentMark(Student student, double mark) {
		if (!students.stream().anyMatch(e -> e.getId() == student.getId())) {
			throw new ConstraintViolationException("Unregistered Student");
		}
		studentMarks.put(student, mark);
	}

	public double averageMarks() {
		return studentMarks.size() == 0 ? 0
				: studentMarks.values().stream().mapToDouble(e -> e.doubleValue()).sum() / studentMarks.size();
	}
}