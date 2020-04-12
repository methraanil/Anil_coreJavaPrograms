package pkg.Sets;

import java.util.TreeMap;

public class Tree_map {

	public static void main(String[] args) {
		var tm=new TreeMap<Character,Integer>();
		tm.put('z',26);
		tm.put('p',65);
		tm.put('a',96);
		tm.put('d',42);
		
		System.out.println(tm);
		
		tm.replace('d',99);
		System.out.println(tm);
		
		System.out.println("_____________________");
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		
		System.out.println("____________________");
		
		System.out.println(tm.pollFirstEntry());
		
		System.out.println(tm);
		
	}

}
