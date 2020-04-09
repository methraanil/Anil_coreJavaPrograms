package pkg.Lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator03 {

	public static void main(String[] args) {
		var n=new ArrayList<Integer>();
		n.add(22);
		n.add(589);
		n.add(85);
		n.add(25);
		n.add(26);
		System.out.println(n);
		System.out.println("______________________________");
		
		ListIterator i=n.listIterator();
		 while(i.hasNext()) {
			 int k=(int) i.next();
			 if(k%2==1) {
				 k++;
				 i.set(k);
			 }
		 }
		 System.out.println(n);

	}

}
