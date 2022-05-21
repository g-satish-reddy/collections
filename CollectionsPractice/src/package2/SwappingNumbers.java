package package2;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		int x, y ;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value of x :");
		x = scan.nextInt();
		System.out.println("enter value of y :");
		y = scan.nextInt();
		System.out.println("value of x and y befor swap = "+x+" " +y);
		 int temp;
		 
		 /* temp =x;
		 x=y;
		 y=temp; */
		 
		 x=x+y;
		 y = x-y;
		 x= x-y;
		 
		 System.out.println("value of x and y after swap = "+x+" " +y);
		

	}

}
