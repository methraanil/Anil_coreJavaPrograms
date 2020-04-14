package pkg.Date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatter0 {

	public static void main(String[] args) {
		String str1 = "24/12/97";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[MM-dd-yyyy][MMM-dd-yyyy][dd/MM/yyyy][dd/MM/yy]");
		
		LocalDate d1 = LocalDate.parse(str1,formatter);
		
		System.out.println(d1);
	}
}
