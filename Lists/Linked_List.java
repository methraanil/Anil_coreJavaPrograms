package pkg.Lists;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		var l=new LinkedList<Double>();
		
		l.add(1.1);
		l.add(1.2);
		l.add(1.4);
		l.add(1.5);
		System.out.println(l);
		
		l.add(2,1.3);
		System.out.println(l);
		
		System.out.println(l.get(2));
		l.set(4,2.5);
		System.out.println(l);
		l.remove(4);
		System.out.println(l);
		
		System.out.println(l.indexOf(1.4));
		
		System.out.println(l.contains(11.5));
		
		System.out.println(l.subList(1,3));
		
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		
		System.out.println(l);




	}

}
