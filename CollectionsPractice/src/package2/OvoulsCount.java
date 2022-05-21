package package2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class OvoulsCount 
{
	public static void voulsCount(String inputstring)
	{
		HashMap<Character, Integer> voulsCountMap = new HashMap<Character, Integer>();
		voulsCountMap.put('a', 0);
		voulsCountMap.put('e', 0);
		voulsCountMap.put('i', 0);
		voulsCountMap.put('o', 0);
		voulsCountMap.put('u', 0);
		
		char[] strarry = inputstring.trim().toLowerCase().toCharArray();
		
		for(char c:strarry)
		{
			if(voulsCountMap.containsKey(c))
			{
				voulsCountMap.put(c, voulsCountMap.get(c)+1 );
			}
		}
		
		Set s = voulsCountMap.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

	public static void main(String[] args) 
	{
		voulsCount("A quick white fox");
		

	}

}
