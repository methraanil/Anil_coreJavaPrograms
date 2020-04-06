package pkg.strg;

public class String_conversion {
	public static void main(String args[]){
		int i=200;
		System.out.println(Integer.toString(i));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toHexString(i));
		
	String s1="200";
	String s2="11001000";
	String s3="310";
	String s4="c8";
	
	System.out.println(Integer.parseInt(s1));
	System.out.println(Integer.parseInt(s2,2));
	System.out.println(Integer.parseInt(s3,8));
	System.out.println(Integer.parseInt(s4,16));
	

	}

}
