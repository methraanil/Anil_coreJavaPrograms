package pkg.Date_time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeAdd_Sub {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now().minusHours(50);
		System.out.println(t);
		
		LocalTime b=LocalTime.now().plus(50,ChronoUnit.HOURS);
		System.out.println(b);
	}

}
