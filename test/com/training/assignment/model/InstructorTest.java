package com.training.assignment.model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class InstructorTest {

	@Test
	public void givenPartTimeInstructor_whenAmountPayable_thenReturnCorrectResults() {
		PartTimeInstructor partTimeInstructor = new PartTimeInstructor();
		partTimeInstructor.setRatePerHour(10.0);
		partTimeInstructor.setWorkingHours(20);
		assertThat(partTimeInstructor.amountPayable(), is(200d));
	}

	@Test
	public void givenFullTimeInstructor_whenAmountPayable_thenReturnCorrectResults() {
		FullTimeInstructor fullTimeInstructor = new FullTimeInstructor();
		fullTimeInstructor.setSalary(800);
		assertThat(fullTimeInstructor.amountPayable(), is(800d));
	}
}