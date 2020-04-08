package pkg.Arrays;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		int[] v=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Enter the value of "+(i+1)+"th element");
			v[i]=sc.nextInt();
		}
	//	for(int i=0;i<10;i++)
	//	System.out.println(v[i]);

	
	for(int i:v) {
		System.out.println(i);
	}

}
}
