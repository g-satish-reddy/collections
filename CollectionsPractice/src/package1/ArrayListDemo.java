 package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Declaration ArrayList
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		ArrayList<String> al = new ArrayList<String>();
//		List al = new ArrayList();
		
		ArrayList<Comparable> al = new ArrayList<Comparable>();
		
		
		// adding elements to list
		
		al.add(100);
		al.add("Satish");
		al.add(10.5);
		al.add('a');
		al.add(true);
		
		
		
		 System.out.println(al);
		 
		 ArrayList<String> str = new ArrayList<String>();
			
			str.add("apple");
			str.add("banana");
		 
			al.addAll(str);
			
			 System.out.println(al);
			 
			 
		
		/*  //size
		
		System.out.println("number of elements in ArrayList :  "+al.size());
		
		// remove
		al.remove(10.5);
		System.out.println(al);
		
	
		
		al.set(2, 'c');
		System.out.println(al);
		System.out.println(al.contains('c'));
		System.out.println(al.get(2));
		al.isEmpty(); */
		
		//reading data from list
		
	/*	// for loop
		
		for( int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		} */
		
		/* // for each loop
		for(Object xx:al)
		{
			System.out.println(xx);
		}  */
		 
		 // using iterator
		/* Iterator it = al.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 } */
		

	}

}
