package pkg.strg;

public class String_slice {
	public static void main(String args[]){
		String s1="anilkumarmethra";
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,9));
		
		String s2="a n i l";
		String s3=" ";
		String arr[]=s2.split(s3);
		for(String x:arr){
	    System.out.println(x);
		
	}

}
}
