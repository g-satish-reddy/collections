package package2;

import java.util.Scanner;

public class Pract {

	public static void main(String[] args) 
	{
		System.out.println("enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//evenOrOdd(num);
		//noOfEvenOrOddDigits(num);
		
		sumOfDigits(num);
	
	}
	
	public static void sumOfDigits(int num)
	{
		int sum = 0;
		
		while(num!=0)
		{
			int digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		System.out.println("sum of digits :"+sum);
		
	}
	
	public static void noOfEvenOrOddDigits(int num)
	{
		int odd = 0;
		int even = 0;
		
		while(num>0)
		{
			int digit = num%10;
			if(digit%2==0)
			{
				even++;
			}
			else
				odd++;
			
			num = num/10;
		}
		
		System.out.println("no of even digits :"+even);
		System.out.println("no of odd digits :"+odd);
	}
	
	
	
	public static void evenOrOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+" is even");
		}
		else
			System.out.println(num+" is odd");
	}

}
