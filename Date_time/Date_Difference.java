package pkg.Date_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Date_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d=LocalDate.of(1997,Month.DECEMBER, 24);
		Period p=Period.between(d,LocalDate.now());
		System.out.println("Years: "+p.getYears() +" Months: "+p.getMonths()+" Days:"+p.getDays());
		System.out.println(p.toTotalMonths());
		//System.out.println(p.ofDays(0));
	}

}
