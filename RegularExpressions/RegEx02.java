package pkg.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx02 {

	public static void main(String[] args) {
		String s="Today I bought an iphone 10R costs $599.00, I got this after discount of $45.82 and coupoun of $78.00";
		String pat="\\$\\d{1,}\\.\\d{1,}";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(s);
		System.out.println(m.results().count());
		m.reset();
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
