package package1;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("x");
		li.add("y");
		li.add("z");
		li.add("a");
		li.add("b");
		li.add("c");
		
		System.out.println(li);
		
		/*LinkedList Li = new LinkedList();
		Li.addAll(li);
		Li.add("xyz");
		System.out.println(Li);
//		Li.removeAll(li);
//		System.out.println(Li);
		
		Collections.sort(Li, Collections.reverseOrder());
		System.out.println(Li);
		
		Collections.shuffle(Li);
		System.out.println(Li); */
		
		li.addFirst("a1");
		System.out.println(li);

	}

}
