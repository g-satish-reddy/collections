package package2;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] words = str.trim().split(" ");
		System.out.println("no of words in given sentence are :" +words.length);
		

	}

}
