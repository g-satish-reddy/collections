package package2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n,i;
		System.out.println("enter ur number :");
		Scanner scan = new Scanner(System.in);
		n= scan.nextInt();
		scan.close();
		if(n<=1)
		{
			System.out.println("smallest prime number is 2");
		}
		
		for (i=2; i<n; i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				break;
			}	
		}
		if (n==i) 
		{
			System.out.println(n+ " is a prime number");	
		}		
	}

}
