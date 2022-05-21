package package2;

import java.util.Scanner;

public class ReversOfNumber {

	public static void main(String[] args) 
	{
		int num , reverse, a, r;
		System.out.println("enter ur number :");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();
		reverse = 0;
		r = num;
		while(num>0)
		{
			a = num%10;
			reverse = reverse*10+a;
			num = num/10;
		}
		System.out.println("reverse of "+r+" is "+reverse);
	}

}
