package package1;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String[] args) 
	{
	
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(1, "apple");
		ht.put(2, "banana");
		ht.put(3, "carrot");
		ht.put(4, "drums");
		ht.put(5, "egg");
		
	
		System.out.println(ht);
		
		//entry specific methods
		
		for(Entry emt :ht.entrySet())
		{
			System.out.println(emt.getKey()+"-------------"+emt.getValue());
		}
		
		
		

	}

}
