package package1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		
		System.out.println("elements in array:"+al);
		
		Collections.sort(al);
		System.out.println("after sorting"+al);
		
//		Collections.sort(al,Collections.reverseOrder());
//		System.out.println("after revesing:"+ al);
		
		Collections.shuffle(al);
		System.out.println("after shuffling "+al);
		
		Collections.reverse(al);
		System.out.println("after revesing:"+ al);
	}

}
