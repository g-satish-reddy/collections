package package2;

import java.util.Scanner;

public class Array_max_min {

	public static void main(String[] args) 
	{
		System.out.println("enter array size :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("enter array elements :");
		for (int j = 0; j < a.length; j++) {
			 a[j]= sc.nextInt();
			
		}
		sc.close();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.println("max value in the array is "+max);
		System.out.println("min value in the array is "+min);
		

	}

}
