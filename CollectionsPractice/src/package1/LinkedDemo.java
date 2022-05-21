package package1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		
		// add elements 
		
		li.add(100);
		li.add('a');
		li.add("anything");
		li.add(10.25);
		li.add(true);
		li.add(null);
		System.out.println(li);
		
		/* System.out.println(li.size());
		
		li.remove(true);
		System.out.println("after removing"+li);
		
		li.add(0, li);
		li.get(0);
		li.set(0, li);
		li.contains(li);
		li.isEmpty(); */
		
		// for loop
		/*for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		} */
		
		// iterator
		
		Iterator it= li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		

	}

}
