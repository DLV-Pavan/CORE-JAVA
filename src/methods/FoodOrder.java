package methods;
import java.util.Scanner;

public class FoodOrder {

	    static double bill, discount, finalBill;

	    // Display Menu
	    static void displayMenu() {
	        System.out.println("------ FOOD MENU ------");
	        System.out.println("1. Pizza      - ₹200");
	        System.out.println("2. Burger     - ₹150");
	        System.out.println("3. Sandwich   - ₹100");
	        System.out.println("4. Biryani    - ₹250");
	        System.out.println("5. Cool Drink - ₹50");
	    }

	    // Calculate Bill
	    static void calculateBill(int quantity, double price) {
	        bill = quantity * price;
	    }

	    // Calculate Discount
	    static void calculateDiscount(double bill) {

	        if (bill > 1000) {
	            discount = (bill * 10)/100;
	        } else {
	            discount = 0;
	        }

	        finalBill = bill - discount;
	    }

	    // Print Bill
	    static void printBill() {
	        System.out.println("Total Bill = ₹" + bill);
	        System.out.println("Discount = ₹" + discount);
	        System.out.println("Final Bill = ₹" + finalBill);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        displayMenu();

	        System.out.print("Enter Item Number: ");
	        int choice = sc.nextInt();

	        System.out.print("Enter Quantity: ");
	        int quantity = sc.nextInt();

	        double price = 0;

	        if (choice == 1) {
	            price = 200;
	        } else if (choice == 2) {
	            price = 150;
	        } else if (choice == 3) {
	            price = 100;
	        } else if (choice == 4) {
	            price = 250;
	        } else if (choice == 5) {
	            price = 50;
	        } else {
	            System.out.println("Invalid Choice");
	            return;
	        }

	        calculateBill(quantity, price);
	        calculateDiscount(bill);
	        printBill();

	        sc.close();
	    }
	}

