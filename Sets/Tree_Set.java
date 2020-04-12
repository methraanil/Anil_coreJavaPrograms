package pkg.Sets;

import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		var ts=new TreeSet<Integer>();
		ts.add(2);
		ts.add(5);
		ts.add(6);
		ts.add(1);
		ts.add(9);
		
		System.out.println(ts);
	System.out.println(ts.higher(6));
		System.out.println("_________________");
		System.out.println(ts);
		System.out.println(ts.first());
	//	Iterator<Integer> i=ts.iterator();
		

	}

}
