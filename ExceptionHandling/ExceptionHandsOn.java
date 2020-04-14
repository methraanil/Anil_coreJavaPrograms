package pkg.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandsOn {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A: ");
		a=sc.nextInt();
		System.out.println("Enter value of B: ");
		b=sc.nextInt();
	   int f= divide(a,b);
		System.out.println(f);
		int[] arr= {1,2,3,4};
		array(arr,b);
	
	}
	public static int divide(int x,int y) {
		try {
		
		return (x/y);
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	 finally {
		 System.out.println("Finally got executed "+y);
	 }
		return 0;
	

}
	public static void array(int[] h,int p) {
		try {
		System.out.println(h[p]);	
		}
		catch(Exception l) {
			System.out.println(l.getMessage());
		}
	}
}
