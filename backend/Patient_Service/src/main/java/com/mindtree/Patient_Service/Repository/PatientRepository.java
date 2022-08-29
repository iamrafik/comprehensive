package com.mindtree.Patient_Service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.Patient_Service.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>{
	
	Patient findById(int ptId);

}
