package pkg.strg;

public class String_replace {
	public static void main(String args[]){
	String s1="hibthisbisbanil";
	String s2="b";
	String s3=" ";
	System.out.println(s1.replace(s2,s3));
	String s4="H&o&w%&^% a%&re&% y%^o%u&^*";
	String patt="[^A-Za-z0-9\\s]";
	System.out.println(s4.replaceAll(patt,""));
}
}
