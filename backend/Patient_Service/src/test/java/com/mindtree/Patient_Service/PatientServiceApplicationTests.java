package com.mindtree.Patient_Service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.Patient_Service.Controller.PatientController;

@SpringBootTest
class PatientServiceApplicationTests {
	@Autowired
	PatientController patientcontroller;

	@Test
	void contextLoads() {
		assertThat(patientcontroller.list()).isNotEmpty();
	}

}
