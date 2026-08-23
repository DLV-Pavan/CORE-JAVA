package encapsulation;

import java.util.Scanner;

class Car {
    private String model;
    private int year;

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car car = new Car();

        car.setModel(sc.nextLine());
        car.setYear(sc.nextInt());

        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

    }
}