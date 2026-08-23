package constructor;

public class Laptop {
	
		String brand;
		String model;
		int price;
		
		public Laptop(String brname, String brmodel, int brprice) {
			brand = brname;
			model = brmodel;
			price = brprice;
			
		}
		
		public Laptop(Laptop l1) {
			brand = l1.brand;
			model = l1.model;
			price = l1.price;
			
		}
		public void display() {
			System.out.println("Brand:"+ brand);
			System.out.println("model:"+ model);
			System.out.println("price:"+ price);			
			System.out.println();

		}
		
		
		public static void main(String args[]) {
			Laptop l1 = new Laptop("Dell", "Inspiron 15", 62000);
			Laptop l2 = new Laptop(l1);
			
			System.out.println("Laptop 1");
			l1.display();
			
			System.out.println("Laptop 2");
			l2.display();
			
		}

	}


