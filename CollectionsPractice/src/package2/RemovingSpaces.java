package package2;

import java.util.Scanner;

public class RemovingSpaces {

	public static void main(String[] args) {
		System.out.println("enter your txt: ");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
//		String newstring  =str.trim().replace(" ", "");
//		System.out.println(newstring);
		scan.close();
		
		String[] strary = str.split(" ");
		String nospacestring = "";
		for(String ch: strary)
		{
			nospacestring = nospacestring+ch;
		}
		System.out.println(nospacestring);
		

	}

}
