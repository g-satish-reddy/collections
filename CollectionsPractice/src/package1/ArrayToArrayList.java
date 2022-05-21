package package1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		String arr[] = {"apple", "banana", "carrot", "pineapple", "beans"};
		
//		System.out.println(arr[2]);
		
		/* for(String value:arr)
		{
			System.out.println(value);
			
		} */
		
		/* Object[] arr = al.toArray();
			
			System.out.println(arr); */
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		
		for(Object xx:al)
		{
			System.out.println(xx);
		}
		
	

	}

}
