
public class MedicalStaff extends Hospital {
	String fid;
	String fname;
	String fdesignation;
	int i = 0;
	int z=0;
	
	Doctor[] d = new Doctor[2];
	CareTakers[] CK = new CareTakers[5];
	
	public void addDoctor(Doctor doctor,String name) {
		this.fname=name;
		if(i<d.length) {
			d[i]=doctor;
			System.out.println("Doctor added at index" + " " + i );
			System.out.println("Doctor at index 0  is "+ " "+ fname);
			i++;
		}
	}
	
	public void addCareTakers(CareTakers CareTaker) {
		if(i<CK.length) {
			CK[i]=CareTaker;
			System.out.println("CareTaker added at index"+ " " + i );
			i++;
	}
}
	
	public void listDoctors() {
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
	}
}

	

