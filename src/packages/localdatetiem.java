package packages;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class localdatetiem {
	public static void main(String args[]) {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println("Local date: " + ld);
		System.out.println("Local Time: " + lt);
		System.out.println("LocalDateTime: " + ldt);
		 
	}

}

