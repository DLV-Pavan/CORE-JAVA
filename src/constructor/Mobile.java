package constructor;

public class Mobile {

    // Instance variables
    int mobileId;
    String brand;
    String model;
    double price;

    // Default Constructor
    public Mobile() {
        mobileId = 1001;
        brand = "Samsung";
        model = "Galaxy A35";
        price = 28000.0;
    }

    // Parameterized Constructor
    public Mobile(int mobileId, String brand, String model, double price) {
        this.mobileId = mobileId;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy Constructor
    public Mobile(Mobile m) {
        this.mobileId = m.mobileId;
        this.brand = m.brand;
        this.model = m.model;
        this.price = m.price;
    }

    // Display Method
    public void display() {
        System.out.println("Mobile ID : " + mobileId);
        System.out.println("Brand     : " + brand);
        System.out.println("Model     : " + model);
        System.out.println("Price     : " + price);
    }

    public static void main(String[] args) {

        // Default Constructor
        Mobile mobile1 = new Mobile();

        // Parameterized Constructor
        Mobile mobile2 = new Mobile(1002, "OnePlus", "Nord CE 5", 24999.0);

        // Copy Constructor
        Mobile mobile3 = new Mobile(mobile2);

        System.out.println("================== MOBILE DETAILS ==================\n");

        System.out.println("Mobile 1 (Default Constructor)");
        System.out.println("--------------------------------");
        mobile1.display();

        System.out.println("\nMobile 2 (Parameterized Constructor)");
        System.out.println("------------------------------------");
        mobile2.display();

        System.out.println("\nMobile 3 (Copy Constructor)");
        System.out.println("---------------------------");
        mobile3.display();

        // Update price of Mobile 3
        mobile3.price = 23000.0;

        System.out.println("\n====================================================");
        System.out.println("After Updating the Price of Mobile 3");
        System.out.println("====================================================\n");

        System.out.println("Mobile 2 Details");
        System.out.println("----------------");
        mobile2.display();

        System.out.println("\nMobile 3 Details");
        System.out.println("----------------");
        mobile3.display();
    }
}