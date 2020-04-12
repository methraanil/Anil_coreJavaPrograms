package pkg.Sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var lhs=new LinkedHashSet<Integer>();
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(5);
		
		System.out.println(lhs);
		
		
		var list=new ArrayList<Integer>();
		list.addAll(lhs);
		System.out.println("_______________");
		System.out.println(lhs);

	}

}
