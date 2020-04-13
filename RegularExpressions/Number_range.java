package pkg.RegularExpressions;

public class Number_range {

	public static void main(String[] args) {
		String s= "[0-9][0-9]?";
		String t="99";
		System.out.println(t.matches(s));
		
		String s1= "[0-9][0-9]?[0-9]?|1000";
		String t1="1000";
		System.out.println(t1.matches(s1));
		
		String s2= "99|[1-9][0-9][0-9][0-9]?";
		String t2="9000";
		System.out.println(t2.matches(s2));
		
		String s3= "2[5-9]|[3-6][0-9]|7[0-5]";
		String t3="38";
		System.out.println(t3.matches(s3));
		
		String s4= "2[2-3][0-9]|240";
		String t4="236";
		System.out.println(t4.matches(s4));
	}

}
