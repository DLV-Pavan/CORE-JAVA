package constructorchaining;

public class Food {
	int orderid;
	String resname;
	String Fooditem;
	String address;
	
	public Food(int orderid) {
		this.orderid = orderid;
		System.out.println("Order id:" + orderid);
	}
	
	public Food(int orderid,String resname) {
		this(orderid);
		this.resname = resname;
		System.out.println("Restaurant: "+resname);
	}
	
	public Food(int orderid,String resname, String Fooditem) {
		this(orderid,resname);
		this.Fooditem = Fooditem;
		System.out.println("Fooditem:"+Fooditem);
	}
	
	public Food(int orderid,String resname, String Fooditem, String address) {
		this(orderid,resname,Fooditem);
		this.address = address;
		System.out.println("Delivery address:"+ address);
	}
	public static void main(String args[]) {
		System.out.println("Food order Started");
		Food F1 = new Food(1001,"Paradise","Chicken biryani","Hyderabad");
	}

}



