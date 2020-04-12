package pkg.Sets;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSets {
	public static void main(String args[]) {
		HashSet<Integer> s=new HashSet<Integer>();
		s.add(21);
		s.add(44);
		s.add(435);
		s.add(46);
		s.add(57);
		s.add(33);
		s.add(65);
		
		System.out.println(s);
		
		s.remove(435);
		System.out.println(s);
		System.out.println(s.size());
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(46);
		set.add(65);
		set.add(10);
		set.add(33);
		set.add(58);
		
		//s.addAll(set);
		s.retainAll(set);
		System.out.println("___________________--");
		System.out.println(s);
		
		System.out.println("________________________");
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		 a.addAll(set);
		 
		 System.out.println(a);
		
		
	}
}
