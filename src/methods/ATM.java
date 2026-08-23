package methods;
import java.util.Scanner;
public class ATM {

	    static double balance = 20000;

	    // Check Balance
	    static void checkBalance() {
	        System.out.println("Current Balance = ₹" + balance);
	    }

	    // Deposit Money
	    static void deposit(double amount) {
	            balance = balance + amount;
	            System.out.println("Money Deposited Successfully");
	            System.out.println("Updated Balance = ₹" + balance);
	        } 

	    // Withdraw Money
	    static void withdraw(double amount) {
	            balance = balance - amount;
	            System.out.println("Money Withdrawn Successfully");
	            System.out.println("Updated Balance = ₹" + balance);
	    }      

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");

	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();

	        if (choice == 1) {
	            checkBalance();
	        }

	        if (choice == 2) {
	            System.out.print("Enter amount to deposit: ");
	            double amount = sc.nextDouble();
	            deposit(amount);
	        }

	        if (choice == 3) {
	            System.out.print("Enter amount to withdraw: ");
	            double amount = sc.nextDouble();
	            withdraw(amount);
	        }

	    }
	}


