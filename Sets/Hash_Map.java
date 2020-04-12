package pkg.Sets;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map {

	public static void main(String[] args) {
		var hs=new HashMap<Integer,String>();
		
		hs.put(1,"Anil");
		hs.put(2,"Sunil");
		hs.put(3,"Laxmi");
		hs.put(4,"Sai");
		hs.put(5,"Govindu");
		
		System.out.println(hs);
		 System.out.println(hs.containsValue("anil"));
		 hs.put(5,"Rohan");
		 
		 System.out.println("_________________");
		 System.out.println(hs);
		 System.out.println("_________________");
		 System.out.println(hs.values());
		 System.out.println("_________________");
		 var s=hs.keySet();
		 System.out.println(s);
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the values ::");
		 
		 int a;
		 String b;
		 a=sc.nextInt();
		 System.out.println("");
		 System.out.println("String :  ");
		 b=sc.next();
		 
		 hs.put(a,b);
		 
		 System.out.println("________________-");
		 System.out.println(hs);

	}

}
