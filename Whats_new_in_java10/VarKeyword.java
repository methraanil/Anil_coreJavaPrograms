package pkg.Whats_new_in_java10;

import java.util.Scanner;

public class VarKeyword {

	public static void main(String[] args) {
		var a=10;
		int b=20;
		System.out.println(a+b);
		var Sc=new Scanner(System.in);
		var r=add(a,b);		
		System.out.println(r);
		var arr=new int[10];
		
		
	}
	public static int add(int e,int q) {
		return e+q+10;
	}

}
