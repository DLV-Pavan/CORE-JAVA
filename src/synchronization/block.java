package synchronization;

class blockhe {

    void display() {

        synchronized (this) {

            System.out.println("Hello");
        }
    }
}

public class block {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.display();
    }
}