package Abstract;

abstract class Ride_booking1 {
	String drivername;
	int vehiclenumber;
	String pickuplocation;
	String droplocation;
	
	Ride_booking1(String drivername, int vehiclenumber, String pickuplocation, String droplocation)
	{
		this.drivername = drivername;
		this.vehiclenumber = vehiclenumber;
		this.pickuplocation = pickuplocation;
		this.droplocation = droplocation;
	}
	
	public void displayRidedetails()
	{
		System.out.println("enter driver name: " + drivername);
		System.out.println("enter vehicle number: " + vehiclenumber);
		System.out.println("enter pickuplocation: " + pickuplocation);
		System.out.println("enter droplocation: " + droplocation);
	}
	
	abstract void calculateFare(double distance);

}

class BikeRide extends Ride_booking1
{

	BikeRide(String drivername, int vehiclenumber, String pickuplocation, String droplocation) {
		super(drivername, vehiclenumber, pickuplocation, droplocation);
	}

	@Override
	void calculateFare(double distance) {
		// TODO Auto-generated method stub
		
	}
}

class CarRide extends Ride_booking1
{

	CarRide(String drivername, int vehiclenumber, String pickuplocation, String droplocation) {
		super(drivername, vehiclenumber, pickuplocation, droplocation);
	}

	@Override
	void calculateFare(double distance) {
		// TODO Auto-generated method stub
		
	}
}

class AutoRide extends Ride_booking1
{

	AutoRide(String drivername, int vehiclenumber, String pickuplocation, String droplocation) {
		super(drivername, vehiclenumber, pickuplocation, droplocation);
	}

	@Override
	void calculateFare(double distance) {
		// TODO Auto-generated method stub
		
	}
}

public class Ride_booking{
	public static void main(String args[]) {
		Ride_booking1 br = new BikeRide("Pavan",1,"KPHB","JNTUH");
		br.displayRidedetails();
		br.calculateFare(5);
		
		System.out.println();
		
		Ride_booking1 cr = new CarRide("Sunil",2,"Hitech","Gachibowli");
		cr.displayRidedetails();
		cr.calculateFare(10);
		
		System.out.println();
		
		Ride_booking1 ar = new AutoRide("Venkat",3,"Miyapur","Lingampalli");
		ar.displayRidedetails();
		ar.calculateFare(20);
		
	}
	
}

