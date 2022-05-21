package package2;

import java.util.HashMap;

public class CharCount 
{
	public static void characterCount(String instring)
	{
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[] strArray = instring.replace(" ", "").toLowerCase().toCharArray();
		
		for(char c : strArray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{
				charCountMap.put(c, 1);
			}
		}
		System.out.println(instring+"   "+charCountMap);
	}

	public static void main(String[] args) 
	{
		characterCount("All is well");
		

	}

}
