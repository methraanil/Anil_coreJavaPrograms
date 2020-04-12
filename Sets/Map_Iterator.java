package pkg.Sets;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map_Iterator {

	public static void main(String[] args) {
		var tm=new TreeMap<Character,Integer>();
		tm.put('z',26);
		tm.put('p',65);
		tm.put('a',96);
		tm.put('d',42);
		
		 for(Entry<Character, Integer> e:tm.entrySet()	){
			 System.out.println(e);
			 		 }
		 System.out.println("__________________");
		Iterator it=tm.entrySet().iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }

	}

}
