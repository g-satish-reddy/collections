package package2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num;
		System.out.println("enter ur number :");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		int fact = 1;
		for(int i=1; i<= num; i++)
		{
			fact= fact*i;
		}
		System.out.println("factorial of "+num+" is " +fact);
	}
	
	public static int factorial(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else
		return num*factorial(num-1);		
	}

}
