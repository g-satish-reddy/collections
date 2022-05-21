package package2;

public class Second_heighst_Array {

	public static void main(String[] args) {
		
		int[] a = {44,66,99,77,33,22,55,-44,-55,-22};
		
		/* int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]>highest)
			{
				secondHighest = highest;
				highest = a[i];
			}
			else if(a[i]>secondHighest)
			{
				secondHighest = a[i];
			}
		}
		System.out.println(secondHighest); */
		
		int minimum = Integer.MAX_VALUE;
		int secondmin = Integer.MAX_VALUE;
		
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]<minimum)
			{
				secondmin = minimum;
				minimum = a[i];
			}
			else if(a[i]<secondmin)
			{
				secondmin = a[i];
			}
		}
		System.out.println(secondmin);
	}

}
