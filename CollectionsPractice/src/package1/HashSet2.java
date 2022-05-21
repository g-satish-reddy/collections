package package1;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Integer> en = new HashSet<Integer>();
		
		en.add(2);
		en.add(4);
		en.add(6);
		en.add(8);
		
		en.add(6);
		
		System.out.println("HashSet:"+en);
		
		/* HashSet<Integer> num = new HashSet<Integer>();
		num.add(10);
		num.addAll(en);
		System.out.println(num);
		num.removeAll(en);
		System.out.println(num); */

	}

}
