package Multithreading;

public class amountwithdraw {

    static class Account {

        int balance = 1000;

        synchronized void withDraw(int amount) throws InterruptedException {

            while (amount > balance) {
                System.out.println("Insufficient balance: "
                        + Thread.currentThread().getName());

                System.out.println("Waiting for deposit..........");

                wait();
            }

            balance = balance - amount;

            System.out.println("Withdraw successful...");
            System.out.println("Remaining balance: " + balance);
        }

        synchronized void deposit(int amount) {

            balance = balance + amount;

            System.out.println("Deposit successful...");
            System.out.println("Current balance: " + balance);

            notify();
        }
    }

    static class Customer implements Runnable {

        Account ac;

        Customer(Account ac) {
            this.ac = ac;
        }

        @Override
        public void run() {
            try {
                ac.withDraw(1100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Account ac = new Account();

        Customer c1 = new Customer(ac);

        Thread t1 = new Thread(c1, "Ram");

        t1.start();

        Thread.sleep(1000);

        System.out.println("Deposit money using main thread");

        ac.deposit(1000);
    }
}