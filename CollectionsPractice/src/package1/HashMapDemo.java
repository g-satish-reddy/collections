package package1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
//		HashMap hm = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "jhon");
		hm.put(102, "alex");
		hm.put(103, "sam");
		hm.put(104, "echo");
		hm.put(105, "rams");
		hm.put(106, "alex");
		
		System.out.println(hm);
		
		hm.remove(106);
		System.out.println(hm);
		System.out.println(hm.containsKey(103));
		System.out.println(hm.containsValue("xcx"));
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		 /* for(Map.Entry entr:hm.entrySet())
		{
			System.out.println(entr.getValue());
			
		} */
		
		Set s = hm.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
