package com.grantbroadwater.signInAssistant.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.grantbroadwater.school.Student;

public class ModelTest {

	Model model;
	
	@Test
	public void test() {
		model = new Model();

		model.loadData();
		
		assertEquals("Chris", model.getStudentBody().get("20202").getFirstName());
		assertEquals("Grant", model.getAdministration().get("10101").getFirstName());
		System.out.println(model.getSchedules()[0]);
	}
	
	@Test
	public void testStudentChooser(){
		model = new Model();
		
		Student s1 = new Student("Grant", "Broadwater", "10101", 12);
		Student s2 = new Student("Chris", "Rood", "10101", 12);
		Student result = model.determineWhichStudentToSave(s1, s2);
		System.out.println(result.getFirstName());
	}

}
