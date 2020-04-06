package pkg.strg;

public class String_comparision {
	public static void main(String args[]){
		String s1="Anil";
		String s2="anil";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		if (s1.equals(s2))
			System.out.println("Strings are equal");
		else
				System.out.println("Strings are not equal");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		String patt="[A-Z]{1,}";
		System.out.println(s1.matches(patt));
			
		
	}

}
