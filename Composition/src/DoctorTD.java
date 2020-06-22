
public class DoctorTD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Doctor d = new Doctor();
			Patient p = new Patient();
			Hospital h = new Hospital(d,p);
			//Saketh s = new Saketh("sak",25);
			PatientName[] patient = {new Saketh("Red", 27), new Sindhu("Violet", 25)};
			//h.admit(s);
			h.putPatients(patient);
		}

	}


