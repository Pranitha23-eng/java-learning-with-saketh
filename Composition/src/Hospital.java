public class Hospital {
	Doctor fdoctor;
	Patient fpatient;
	public Hospital(Doctor doctor , Patient patient) {
		this.fdoctor=doctor;
		this.fpatient = patient;
		
	}
	public void admit(PatientName patient) {
		fpatient.addPatient(patient);
		System.out.println(patient);
	}
	public void discharge() {
		System.out.println("Patient Discharged :)");
	}
	public void putPatients(PatientName[] patient) {
		for(PatientName PN : patient) {
			fpatient.addPatient(PN);
			System.out.println(PN);
		}
	}
}



