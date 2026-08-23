package packages;

import java.util.Date;
import java.text.SimpleDateFormat;

public class CustomDate {
    public static void main(String args[]) {

        Date d = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat f4 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        SimpleDateFormat f5 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat f6 = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("dd/MM/yyyy : " + f1.format(d));
        System.out.println("MM-dd-yyyy : " + f2.format(d));
        System.out.println("dd MMM yyyy : " + f3.format(d));
        System.out.println("EEEE, dd MMMM yyyy : " + f4.format(d));
        System.out.println("HH:mm:ss : " + f5.format(d));
        System.out.println("hh:mm:ss a : " + f6.format(d));
    }
}