package package1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet(); // default capacity 16 Load factor 0.75
		
//		HashSet hs = new HashSet(100); // initial capacity 100 elements
//		HashSet hs = new HashSet(100, (float).90);
//		HashSet<Integer> hs = new HashSet<Integer>();
		
		// ading elements 
		
		hs.add(100);
		hs.add('a');
		hs.add("anything");
		hs.add(10.25);
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);// [null, a, 100, 10.25, anything, true]
		
		// removing element
		
		hs.remove(10.25);
		System.out.println("after removing"+hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains('a'));
		System.out.println(hs.size());

		 /* for(Object ob:hs)
		{
			System.out.println(ob);
		} */
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
