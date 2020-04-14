package pkg.Date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Add_Sub {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now().plusDays(3);
		System.out.println(d);
		LocalDate g=LocalDate.now().minus(10,ChronoUnit.DAYS);
		System.out.println(g);

	}

}
