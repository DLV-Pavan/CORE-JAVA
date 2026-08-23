package constructorchaining;

public class Product {
	int oid;
	String oname;
	double price;
	
	public Product(int oid) {
		this.oid = oid;
		System.out.println("order is created\n oid: "+oid);
	}
	
	public Product(int oid,String oname) {
		this(oid);
		this.oname = oname;
		System.out.println("order name: "+oname);
	}
	
	public Product(int oid,String oname, double price) {
		this(oid,oname);
		this.price = price;
		System.out.println("order price: "+price);
	}
	
	public static void main(String args[]) {
		Product p1 = new Product(101,"Laptop", 30000);
	}

}

