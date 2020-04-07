package pkg.specialClasses;
import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a String");
		s=sc.nextLine();
		String temp="";
		for(int i=0;i<s.length();i++){
			temp=s.charAt(i)+temp;	
		}
		System.out.println(temp);
		int n;
		System.out.println("Enter  a number");
		n=sc.nextInt();
		while(n!=0){
			System.out.println("hello"+n);
			n--;
		}
		
	}

}
