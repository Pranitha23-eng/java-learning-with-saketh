public class Doctor {
	String fname;
	int fid;
	String fspecilization;
	
	public void TreatPatient(Patient[] PatientName) {
		for (Patient v : PatientName) {
			System.out.println("Treating: "+v.getClass().getSimpleName());
		}
	};
	public void performOperation() {
		System.out.println("operation performed successfully");
	}
	


}
