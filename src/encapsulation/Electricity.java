package encapsulation;

class electricitybill {

    // Method with units only
    double calculateBill(int units) {
        double rate = 5;
        return units * rate;
    }

    // Method with units and rate
    double calculateBill(int units, double rate) {
        return units * rate;
    }

    // Method with units, rate and tax
    double calculateBill(int units, double rate, double tax) {
        double bill = units * rate;
        double taxAmount = bill * tax / 100;
        return bill + taxAmount;
    }

}

public class Electricity {

    public static void main(String[] args) {

        electricitybill e1 = new electricitybill();

        double bill1 = e1.calculateBill(100);

        double bill2 = e1.calculateBill(100, 6);

        double bill3 = e1.calculateBill(100, 6, 10);

        System.out.println("Bill using default rate: " + bill1);

        System.out.println("Bill using given rate: " + bill2);

        System.out.println("Final bill including tax: " + bill3);
    }
}
