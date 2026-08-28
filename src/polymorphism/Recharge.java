package polymorphism;

class balance {

    String mobilenumber;
    double amount;
    String serviceprovider;
    int validity;
    double cashback;

    // Constructor overloading

    balance(String mobilenumber) {
        this.mobilenumber = mobilenumber;
        this.amount = 299;
    }

    balance(String mobilenumber, double amount) {
        this.mobilenumber = mobilenumber;
        this.amount = amount;
        this.serviceprovider = "jio";
    }

    balance(String mobilenumber, double amount, String serviceprovider) {
        this.mobilenumber = mobilenumber;
        this.amount = amount;
        this.serviceprovider = serviceprovider;
    }

    // Method overloading

    void recharge() {
        validity = 28;
    }

    void recharge(int validity) {
        this.validity = validity;
    }

    void recharge(int validity, double cashback) {
        this.validity = validity;
        this.cashback = cashback;
    }

    // Display details

    void displayRechargeDetails() {
        System.out.println("Mobile Number: " + mobilenumber);
        System.out.println("Amount: " + amount);
        System.out.println("Service Provider: " + serviceprovider);
        System.out.println("Validity: " + validity);
        System.out.println("Cashback: " + cashback);
    }
}

public class Recharge {

    public static void main(String[] args) {

        balance br = new balance("8317586375", 299, "jio");

        br.recharge();
        br.recharge(56);
        br.recharge(67, 84);

        br.displayRechargeDetails();
    }
}