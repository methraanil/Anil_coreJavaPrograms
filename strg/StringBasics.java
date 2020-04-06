package pkg.strg;

public class StringBasics {

	public static void main(String[] args) {
	   String s1="Anil Kumar ";
	   String s2="Methra";
	   String s3=s1+s2;
	   System.out.println(s3);
	   
	   String s4=s1.concat(s2);
	   System.out.println(s4);
	   
	   String s5=" asln ADsl dlf SL dladf afa SLKf az  ";
	   System.out.println(s5);
	   
	   System.out.println(s5.trim());
	   
	  System.out.println(s5.toUpperCase());
	  
	  System.out.println(s5.toLowerCase());
	   
	  System.out.println(s5.isEmpty());
	  
	  String s6="";
	  
	  System.out.println(s6.isEmpty());
		}

}
