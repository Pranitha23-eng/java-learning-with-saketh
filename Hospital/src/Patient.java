
public class Patient extends Hospital  {
	String fname;
	String fdisease;
	int fage;
	int i=0;
	Patient[] p = new Patient[2];
	
	public void explainProblem() {
		
	}
	
	public void makePayment() {
		
	}
	
	public void buyMedicine() {
		
	}
	
	public void addPatient(String patient) {
		if(i<p.length) {
			this.fname= patient;
			System.out.println("Patient added at index" + " " + i );
			System.out.println(fname);
			i++;
		}
	}
	

}
