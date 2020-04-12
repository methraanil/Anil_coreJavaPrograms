package pkg.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class IteratingSets {

	public static void main(String[] args) {
		 HashSet<Integer> s= new HashSet<Integer>();
		    s.add(100);
			s.add(200);
			s.add(300);
			s.add(400);
			s.add(500);
			
			for(int i:s) {
				System.out.println(i);
			}
			
			var ts=new TreeSet<Double>();
			
			ts.add(1.56);
			ts.add(5.68);
			ts.add(9.245);
			ts.add(9.244);
			ts.add(6.24);
			ts.add(3.33);
			System.out.println("____________________");
			
			
			Iterator<Double> it=ts.iterator();
			while(it.hasNext()) {
			
				System.out.println(it.next());
			}
			
			
	}

}
