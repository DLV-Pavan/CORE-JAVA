package polymorphism;
class room {

    String customerName;
    String roomType;
    int days;

    // Constructor overloading
    room(String name) {
        customerName = name;
        days = 4;
    }

    room(String name, String type) {
        customerName = name;
        roomType = type;
        days = 5;
        
    }

    room(String name, String type, int d) {
        customerName = name;
        roomType = type;
        days = d;
    }

    // Method overloading
    double calculateBill() {
        return 2000 * days;
    }

    double calculateBill(double rate) {
        return rate * days;
    }

    double calculateBill(double rate, double discount) {
        double bill = rate * days;
        return bill - (bill * discount / 100);
    }

    void displayBooking() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Days: " + days);
    }
}

public class Roombooking {
    public static void main(String[] args) {

        room r = new room("Pavan", "Deluxe", 3);

        r.displayBooking();

        System.out.println("Default Bill: " + r.calculateBill());
        System.out.println("Custom Bill: " + r.calculateBill(2500));
        System.out.println("Discount Bill: " + r.calculateBill(2500, 10));
    }
}