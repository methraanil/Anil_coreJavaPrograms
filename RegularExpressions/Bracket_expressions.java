package pkg.RegularExpressions;

//import java.util.Scanner;

public class Bracket_expressions {

	public static void main(String[] args) {
		String pat="[ask]nil";
		
		String s="anil";
		
		System.out.println(s.matches(pat));
	//	System.out.println(sunil.matches(pat));
		
		String p="[A]{3}[A-Za-z0-9]{1,}";
		
		String a="AAA536asfgsdgx4";
		System.out.println(a.matches(p));
		
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter a String :");
		//String z=sc.next();
	//	boolean a=false;
		
	/*	do {
		if(z.matches(p)) {
			a=true;
			System.out.println("String matched ");
		}
		else {
			System.out.println("String not matched, enter a valid String");
			break;
		}
		}while(a==false);*/
		

	}

}
