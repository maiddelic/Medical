package record;

import Authorities.*;

public class MedicalRecord {
	private String medicalData;
	private Patient patient;
	private Nurse nurse;
	private Doctor doctor;
	private String division;
	private StringBuilder sb;

	public MedicalRecord(String medicalData, Patient patient, Nurse nurse,
			Doctor doctor, String division) {
		this.medicalData = medicalData;
		this.patient = patient;
		this.nurse = nurse;
		this.doctor = doctor;
		this.division = division;
		sb = new StringBuilder();
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatientID(String newID) {
		patient.setId(newID);
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}

	public String getMedicalData() {
		return medicalData;
	}

	public void addMedicalData(String newMedicalData) {
		sb.append(medicalData + "/n" + newMedicalData);
		medicalData = sb.toString();
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor newDoctor) {
		doctor = newDoctor;
	}

}
