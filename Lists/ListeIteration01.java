package pkg.Lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListeIteration01 {
	public static void main(String args[]) {
		var l=new LinkedList<Double>();
		
		l.add(1.1);
		l.add(1.2);
		l.add(1.4);
		l.add(1.5);
		
		ListIterator<Double> i=l.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	System.out.println("______________");
	i=l.listIterator(l.size());
	while(i.hasPrevious()) {
		System.out.println(i.previous());
	}
	System.out.println("______________");
	i=l.listIterator(1);
	while(i.hasNext()) {
		System.out.println(i.next());
	}
		
	
	}

}
