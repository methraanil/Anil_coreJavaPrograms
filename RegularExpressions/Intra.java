package pkg.RegularExpressions;

public class Intra {

	public static void main(String[] args) {
		String s="35@$4456@$24@$4354@354";
		
		String pattern="[^A-Za-z0-9]";
		
		String s1=s.replaceAll(pattern,"");
		System.out.println(s);
		System.out.println(s1);
		
		

	}

}
