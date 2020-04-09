package pkg.Lists;

import java.util.ArrayList;
import java.util.List;

public class Array_list {

	public static void main(String[] args) {
		var str=new ArrayList<String>();
		str.add("Red");
		str.add("Blue");
		str.add("White");
		str.add("Black");
		
		System.out.println(str.get(2));
		System.out.println(str);
		str.set(2, "element");
		System.out.println(str.get(2));
		
		List<String> s1=str.subList(1,4);
		System.out.println(s1);
		s1.clear();
		System.out.println("Elements of s1 :"+s1);
		str.add("Blue");
		str.add("White");
		str.add("Black");
		str.remove(2);
		System.out.println(str);
		int n=str.indexOf("Black");
		System.out.println(n);
		System.out.println("____________________");
		
		System.out.println(str.contains("White"));
		System.out.println(str.isEmpty());
		
		for(String i:str)
			System.out.println(i);
		
		//System.out.println(s1.isEmpty());  This is not working 
	}

}
