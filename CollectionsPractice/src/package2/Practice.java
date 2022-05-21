package package2;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) 
	{
//		System.out.println("give ur number :");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
		// fibonacci(num);
		
		for(int i = 1; i<=999;i++)
		{
			int num = i;
			armstrong(num);
		}
		

	}
	
	public static void armstrong(int num)
	{
		int arm = 0, r, temp;
		temp = num;
		while(num>0)
		{
			r = num%10;
			arm = arm+r*r*r;
			num = num/10;
		}
		if(temp == arm)
		{
			System.out.println(temp+" is armstrong number");
		}
//		else
//			System.out.println(temp+" is not armstrong number");
		
	}
	
	
	public static void fibonacci(int num)
	{
		int a = 0, b=1, c;
		System.out.println(a);
		System.out.println(b);
		for(int i = 2; i<num; i++)
		{
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
