package com.mindtree.Patient_Service.DoctorAndTemplate;

import com.mindtree.Patient_Service.Entity.Patient;

public class ResponseTemplate {
	private Patient patient;
	private Doctor doctor;

	public ResponseTemplate() {
	}

	public ResponseTemplate(Patient patient, Doctor doctor) {
		this.patient = patient;
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
