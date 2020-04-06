package pkg.strg;

public class String_search {
	public static void main(String args[])
	{
		String s1="Hi my name is Anil";
		String s2="anil";
		
		System.out.println(s1.toLowerCase().contains(s2.toLowerCase()));
		
		System.out.println(s1.startsWith("H"));
		
		System.out.println(s1.endsWith("Anil"));
		
		System.out.println(s1.indexOf("i"));
		
		System.out.println(s1.indexOf("i",3));
		
		System.out.println(s1.lastIndexOf("i"));
	}
}
