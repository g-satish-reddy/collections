package package2;

public class ReversingEachWord {
	
	public static void reverseEachWordOfString(String input)
	{
		String[] words = input.split(" ");
		String revstring = "";
		
		for(int j=0; j < words.length; j++ )
		{
			String word = words[j];
			String revword = "";
			for(int i= word.length()-1; i>= 0; i--)
			{
				revword = revword + word.charAt(i);
			}
			revstring = revstring + revword + " ";	
		}
		System.out.println(revstring);	
	}

	
	
	public static void main(String[] args) 
	{
		reverseEachWordOfString("i can say anything i want");
	}

}
