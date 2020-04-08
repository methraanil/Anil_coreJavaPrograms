package pkg.Arrays;

import java.util.Scanner;

public class EnhancedFor {

	public static void main(String[] args) {
		int n;
		int[] t=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(int i=1;i<10;i++) {
			t[i]=i*n;
		}
		System.out.println("===========================");
		for(int j:t) {
			System.out.println(j);
		}

	}

}
