package pkg.Date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Custom_Date_Time {

	public static void main(String[] args) {
		LocalDate d=LocalDate.of(1997,12,24);
		LocalTime t=LocalTime.of(12,25,5,1265);
		LocalDateTime dt=LocalDateTime.of(d, t);
		
		
		System.out.println(dt);
		

}
}
