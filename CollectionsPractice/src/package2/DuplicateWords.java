package package2;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords 
{
	public static void duplicateWordsCount(String string)
	{
		String[] words = string.split(" ");
		
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String sc:words)
		{
			if(wordCount.containsKey(sc.toLowerCase()))
			{
				wordCount.put(sc.toLowerCase(), wordCount.get(sc)+1);
				
			}
			else
			{
				wordCount.put(sc.toLowerCase(), 1);
			}
		}
		Set<String> wordset = wordCount.keySet();
		for(String ws: wordset)
		{
			if(wordCount.get(ws)>1)
			{
				System.out.println(ws+"  "+wordCount.get(ws));
			}
		}
		
	}

	public static void main(String[] args) 
	{
		duplicateWordsCount("Java is java again java again");
		

	}

}
