package encapsulation;
import java.util.Scanner;

class Library {
    private int bookID;
    private int overdueDays;

    // Setter methods
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setOverdueDays(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    // Getter methods
    public int getBookID() {
        return bookID;
    }

    public int getOverdueDays() {
        return overdueDays;
    }

    // fineByDays(int days)
    public int fineByDays(int days) {
        int fine = days * 5;
        if (fine > 1000)
            fine = 1000;
        return fine;
    }

    // fixedFine()
    public int fixedFine() {
        int fine = 10;
        if (fine > 1000)
            fine = 1000;
        return fine;
    }

    // fineByDaysPlusFixed(int days)
    public int fineByDaysPlusFixed(int days) {
        int fine = days * 5 + 10;
        if (fine > 1000)
            fine = 1000;
        return fine;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library lib = new Library();

        lib.setBookID(sc.nextInt());
        lib.setOverdueDays(sc.nextInt());

        int days2 = sc.nextInt();
        sc.nextInt(); // dummy input
        int days3 = sc.nextInt();

        System.out.println(lib.fineByDays(days2));
        System.out.println(lib.fixedFine());
        System.out.println(lib.fineByDaysPlusFixed(days3));
        System.out.println(lib.getBookID());
        System.out.println(lib.getOverdueDays());
    }
}