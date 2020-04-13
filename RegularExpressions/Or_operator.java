package pkg.RegularExpressions;

public class Or_operator {

	public static void main(String[] args) {
		String s="a(nil|kshay|shish)\\s(kumar|Reddy)";
		String s1="anil kumar";
		String a="ashish Reddy";
		System.out.println(s1.matches(s));
		System.out.println(a.matches(s));

	}

}
