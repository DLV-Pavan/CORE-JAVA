package constructorchaining;

public class Patient {
	int pid;
	String pname;
	String pdisease;
	int bill;
	
	public Patient(int pid) {
		this.pid = pid;
		System.out.println("Patient id:" + pid);
	}
	
	public Patient(int pid,String pname) {
		this(pid);
		this.pname = pname;
		System.out.println("Patient name: "+pname);
	}
	
	public Patient(int pid,String pname, String pdisease) {
		this(pid,pname);
		this.pdisease = pdisease;
		System.out.println("Disease:"+pdisease);
	}
	
	public Patient(int pid,String pname, String pdisease, int bill) {
		this(pid,pname,pdisease);
		this.bill = bill;
		System.out.println("Bill amount:"+ bill);
	}
	public static void main(String args[]) {
		System.out.println("Patient Registration Started");
		Patient p1 = new Patient(101,"Rahul","Fever",2500);
	}

}



