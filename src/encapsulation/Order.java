package encapsulation;

import java.util.Scanner;

public class Order {

    private int orderId;
    private String customerName;
    private double totalAmount;
    private String orderStatus;

    // Setter for Order ID
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    // Getter for Order ID
    public int getOrderId() {
        return orderId;
    }

    // Setter for Customer Name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter for Customer Name
    public String getCustomerName() {
        return customerName;
    }

    // Setter for Total Amount
    public void setTotalAmount(double totalAmount) {
        if (totalAmount >= 0) {
            this.totalAmount = totalAmount;
        } else {
            System.out.println("Total amount cannot be negative");
        }
    }

    // Getter for Total Amount
    public double getTotalAmount() {
        return totalAmount;
    }

    // Setter for Order Status
    public void setOrderStatus(String orderStatus) {

        if (orderStatus.equals("Pending") ||
            orderStatus.equals("Preparing") ||
            orderStatus.equals("Delivered") ||
            orderStatus.equals("Cancelled")) {

            this.orderStatus = orderStatus;

        } else {
            System.out.println("Invalid order status");
        }
    }

    // Getter for Order Status
    public String getOrderStatus() {
        return orderStatus;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Order o = new Order();

        o.setOrderId(sc.nextInt());
        sc.nextLine();

        o.setCustomerName(sc.nextLine());

        o.setTotalAmount(sc.nextDouble());
        sc.nextLine();

        o.setOrderStatus(sc.nextLine());

        System.out.println("Order ID: " + o.getOrderId());
        System.out.println("Customer Name: " + o.getCustomerName());
        System.out.println("Total Amount: " + o.getTotalAmount());
        System.out.println("Order Status: " + o.getOrderStatus());

        sc.close();
    }
}