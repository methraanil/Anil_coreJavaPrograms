package pkg.RegularExpressions;

public class Quantifiers {

	public static void main(String[] args) {
String patt = "ab(xyz){2,}";
		
		String str1 = "abxyzxyzxyzxyzxyzxyz";
		
		System.out.println(str1.matches(patt));
	//	System.out.println(patt.matches(str1));
	}

}
