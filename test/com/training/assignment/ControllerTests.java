package com.training.assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.training.assignment.controller.CourseControllerTest;
import com.training.assignment.controller.InstructorControllerTest;
import com.training.assignment.controller.StudentControllerTest;
import com.training.assignment.model.CourseTest;
import com.training.assignment.model.InstructorTest;

@RunWith(Suite.class)
@SuiteClasses({ CourseControllerTest.class, InstructorControllerTest.class, StudentControllerTest.class,
		InstructorTest.class, CourseTest.class })
public class ControllerTests {

}
