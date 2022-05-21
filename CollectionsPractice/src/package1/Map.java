package package1;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		hp.put(101, "jhon");
		hp.put(102, "alex");
		hp.put(103, "max");
		hp.put(104, "sathen");
		hp.put(105, "demon");
		
		System.out.println(hp);	
		
//		System.out.println(hp.get(103));
		
//		hp.remove(104);
//		System.out.println(hp);
		
//		System.out.println(hp.containsKey(103));
//		System.out.println(hp.containsValue("max"));
//		System.out.println(hp.isEmpty());
//		System.out.println(hp.size());
		
		System.out.println(hp.keySet());
		System.out.println(hp.values());
		System.out.println(hp.entrySet());
		
		

	}

}
