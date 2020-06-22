
public class HospitalTD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedicalStaff m = new MedicalStaff();
		
		Doctor d1 = new Doctor();
		m.addDoctor(d1,"Prakash");
		Doctor d2 = new Doctor();
		m.addDoctor(d2,"dummy");
		Patient p2 = new Patient();
		p2.addPatient("sindhu");
		p2.admit();
		Patient p3 = new Patient();
		p3.addPatient("madhavi");
		p3.admit();
		m.listDoctors();
		
		
		
	}

}
