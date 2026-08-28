package Exceptionpropogation;


public class arthemeticexception {

    static void method3() {
        int a = 10;
        int b = 0;

        int result = a / b;

        System.out.println(result);
    }

    static void method2() {
        method3();
    }

    static void method1() {
        try {
            method2();
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception handled");
        }
    }

    public static void main(String[] args) {
        method1();
    }
}