package package2;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) 
	{
		System.out.println("enter ur number :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
			if(num%2==0)
			{
				System.out.println(num+" is even");
			}
			else
				System.out.println(num+" is odd");		

	}

}
