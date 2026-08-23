package Abstract;

abstract class Restaurant1 {
	String restaurantname;
	String locationname;
	
	Restaurant1(String restaurantname, String locationname){
		this.restaurantname=restaurantname;
		this.locationname=locationname;
	}
	
	public void displayDetails() {
		System.out.println("Restaurant name: "+ restaurantname);
		System.out.println("Location name: "+ locationname);

	}
	
	public void receiveorder() {
		System.out.println("Order received successfully...");
	}
	
	abstract void preparefood();

}

class PizzaRestaurant extends Restaurant1{

	PizzaRestaurant(String restaurantname, String locationname) {
		super(restaurantname, locationname);
	}

	@Override
	void preparefood() {
		// TODO Auto-generated method stub
		System.out.println("preparing pizza");
		
	}
}
	
	class BiryaniRestaurant extends Restaurant1{

		BiryaniRestaurant(String restaurantname, String locationname) {
			super(restaurantname, locationname);
		}

		@Override
		void preparefood() {
			// TODO Auto-generated method stub
			System.out.println("preparing Biryani");
			
		}
	}
		
		class Bakery extends Restaurant1{

			Bakery(String restaurantname, String locationname) {
				super(restaurantname, locationname);
			}

			@Override
			void preparefood() {
				// TODO Auto-generated method stub
				System.out.println("preparing bakery items");
				
			}
			
		}
	
	public class Restaurant{
			public static void main(String args[]) {
				Restaurant1 pr = new PizzaRestaurant("pizza","KPHB");
				pr.displayDetails();
				pr.receiveorder();
				pr.preparefood();
				
				System.out.println();
				
				Restaurant1 br = new BiryaniRestaurant("Birayni", "hyd");
				br.displayDetails();
				br.receiveorder();
				br.preparefood();
				
				System.out.println();
				
				Restaurant1 bak = new Bakery("cake", "jntuh");
				bak.displayDetails();
				bak.receiveorder();
				bak.preparefood();
				
				System.out.println();
			}
		}
	

