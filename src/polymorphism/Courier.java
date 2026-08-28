package polymorphism;
class courierpack{
	double calculateCharge(double weight) {
		return weight * 50;
	}
	double calculateCharge(double weight, double distance) {
		return (weight*50) + (distance * 2);
	}
	
    double calculateCharge(double weight, double distance, boolean express) {
        double charge = (weight * 50) + (distance * 2);

        if(express) {
        	charge = charge + 100;
        }
        
        return charge;
}
}

public class Courier {
	public static void main(String[] args) {
		courierpack c = new courierpack();
        System.out.println(c.calculateCharge(5));
        System.out.println(c.calculateCharge(5,100));
        System.out.println(c.calculateCharge(5,100,true));

	}
}
