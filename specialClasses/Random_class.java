package pkg.specialClasses;

import java.util.Random;

public class Random_class {
public static void main(String args[]){
	Random r=new Random();
	for(int i=0;i<5;i++){
		System.out.println(r.nextInt(50)+50);
	}
	System.out.println("_______________________");
	for(int i=0;i<5;i++){
		System.out.println((int)(Math.random()*1000));
	}
}
}
