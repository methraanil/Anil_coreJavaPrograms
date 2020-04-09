package pkg.Lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator02 {
	public static void main(String args[]) {
		var l=new LinkedList<Double>();
		
		l.add(1.1);
		l.add(null);
		l.add(1.2);
		l.add(null);
		l.add(1.4);
		l.add(null);
		l.add(1.5);
		System.out.println(l);
		System.out.println("_________________");
		
	 ListIterator<Double> i=l.listIterator();
	 while(i.hasNext()) {
		 if(i.next()==null) {
			 i.remove();
		 }
	 }
	 System.out.println(l);
	 l.add(1,null);
	 l.add(3,null);
	 l.add(5,null);
	 System.out.println("_____________");
	 System.out.println(l);
	 
	 ListIterator<Double> j=l.listIterator();
	 while(j.hasNext()) {
		 if(j.next()==null) {
			j.set (0.0); 
		 }
	 }
	 System.out.println(l);
	}
}
