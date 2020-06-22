public class Patient {
	String fname;
	int fage;
	String fdisease;
	PatientName[] PN = new PatientName[100];
	int currentPatients=0;
	
	//PatientName[] PN = new PatientName[100];
	//public void addPatient(PatientName[] PN) {
		//PN[this.currentPatients] = PN;
	   // currentPatients++;
	   // }
	public void removePatient() {
		System.out.println("patient removed from system");
	}
	public void addPatient(PatientName  PatientName) {
		// TODO Auto-generated method stub
		PN[this.currentPatients] = PatientName;
	    currentPatients++;
		
	}

}
