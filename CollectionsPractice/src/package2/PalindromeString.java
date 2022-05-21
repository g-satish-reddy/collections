package package2;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter ur string: ");
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		scan.close();
		if(isItPalindrome(string))
		{
			System.out.println(string+" is a palindrome");
		}
		else
		{
			System.out.println(string+" is not a palindrome");
		}

	}
	
	 /* static boolean isItPalindrome(String str)
	{
		String cleanstr = str.replaceAll(" ", "").toLowerCase();
		
		char[] charary = cleanstr.toCharArray();
		
		int forward = 0;
		int backward = cleanstr.length()-1;
		
		while(forward<=backward)
		{
			if(charary[forward]!=charary[backward])
			{
				return false;
			}
			forward++;
			backward--;
		}
		return true;	
	}  */
	
	// recursive method
	static boolean isItPalindrome(String str)
	{
		String cleanstr = str.replaceAll(" ", "").toLowerCase();
		
		if(cleanstr.length()<2)
		{
			return true;
		}
		else
		{
			if(cleanstr.charAt(0) != cleanstr.charAt(cleanstr.length()-1))
			{
				return false;
			}
			else
			{
				return isItPalindrome(cleanstr.substring(1,cleanstr.length()-1));
			}
		}
	}
	

}
