package com.mindtree.Patient_Service.DoctorAndTemplate;

public class Doctor {
	private long docId;
	private String docName;
	private int docAge;
	private String docGender;
	private String spclIn;

	public Doctor() {
	}

	public Doctor(String docName, int docAge, String docGender, String spclIn) {
		super();
		this.docName = docName;
		this.docAge = docAge;
		this.docGender = docGender;
		this.spclIn = spclIn;
	}

	public long getDocId() {
		return docId;
	}

	public void setDocId(long docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public int getDocAge() {
		return docAge;
	}

	public void setDocAge(int docAge) {
		this.docAge = docAge;
	}

	public String getDocGender() {
		return docGender;
	}

	public void setDocGender(String docGender) {
		this.docGender = docGender;
	}

	public String getSpclIn() {
		return spclIn;
	}

	public void setSpclIn(String spclIn) {
		this.spclIn = spclIn;
	}

}
