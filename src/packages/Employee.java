package packages;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Employee {
	public static void main(String args[]) {
		Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        System.out.println(sdf.format(d));
	}
	
}
