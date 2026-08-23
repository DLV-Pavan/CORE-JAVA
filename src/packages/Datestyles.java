package packages;
import java.util.Date;
import java.text.DateFormat;
public class Datestyles {
	public static void main(String args[]) {
		Date d = new Date();
        DateFormat fullDate = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat longDate = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat mediumDate = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat shortDate = DateFormat.getDateInstance(DateFormat.SHORT);
        

        System.out.println("FULL: " + fullDate.format(d));
        System.out.println("LONG: " + longDate.format(d));
        System.out.println("MEDIUM: " + mediumDate.format(d));
        System.out.println("SHORT: " + shortDate.format(d));
	}

}


