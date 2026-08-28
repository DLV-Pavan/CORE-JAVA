package Exceptionpropogation;

public class checkedexceptionpropg {

    static void m3() throws InterruptedException {

        Thread.sleep(2, 4);
    }

    static void m2() throws InterruptedException {

        m3();
    }

    static void m1() {

        try {
            m2();
        }
        catch (InterruptedException e) {

            System.out.println("Exception handled successfully");
        }
    }

    public static void main(String[] args) {

        m1();
    }
}