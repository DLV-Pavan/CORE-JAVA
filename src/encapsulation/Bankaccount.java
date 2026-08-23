package encapsulation;
class bank{
	String name;
	String type;
	double deposit;
	
	//constructor with name
	bank(String name){
		this.name = name;
		this.type = "current";
		this.deposit = 29000;
	}
	//constructor with name and type
	bank(String name, String type){
		this.name = name;
		this.type = type;
		this.deposit = 34000;
	}
	
	bank(String name, String type, double deposit){
		this.name = name;
		this.type = type;
		this.deposit = deposit;
	}
	
	void display() {
		System.out.println("Customer name:" + name);
		System.out.println("Account type:" + type);
		System.out.println("Initial deposit:" + deposit);
		System.out.println();

	}
}

public class Bankaccount {
	public static void main(String[] args) {
		bank b1 = new bank("Pavan");
		bank b2 = new bank("Rahul","Current");
		bank b3 = new bank("Sunil","Account",34000);
		
		b1.display();
		b2.display();
		b3.display();
	}
}
