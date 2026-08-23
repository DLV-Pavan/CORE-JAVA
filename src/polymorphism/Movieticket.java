package polymorphism;
class Movie {

    // Method 1
    void bookTicket(int tickets) {
        int total = tickets * 200;
        System.out.println("Total Amount = ₹" + total);
    }

    // Method 2
    void bookTicket(int tickets, boolean isPremium) {
        int price;

        if (isPremium) {
            price = 350;
        } else {
            price = 200;
        }

        int total = tickets * price;
        System.out.println("Total Amount = ₹" + total);
    }

    // Method 3
    void bookTicket(int tickets, boolean isPremium, double discount) {
        int price;

        if (isPremium) {
            price = 350;
        } else {
            price = 200;
        }

        double total = tickets * price;
        double finalAmount = total - (total * discount / 100);

        System.out.println("Final Payable Amount = ₹" + finalAmount);
    }
}

public class Movieticket {
    public static void main(String[] args) {

        Movie mt = new Movie();

        mt.bookTicket(3);

        mt.bookTicket(3, true);

        mt.bookTicket(3, true, 10);
    }
}