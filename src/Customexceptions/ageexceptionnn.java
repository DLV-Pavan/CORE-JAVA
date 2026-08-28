package Customexceptions;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class ageexceptionnn {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Invalid age");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        int age = 18;

        try {
            checkAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println("Invalid age");
        }
    }
}
