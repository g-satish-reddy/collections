package package2;

public class ReversingString {

	public static void main(String[] args) 
	{
		/* //  using string Buffer
		StringBuffer sbf = new StringBuffer("my java");
		System.out.println(sbf.reverse()); */
		
		// using iterative method
		/*
		String str = "satishreddy";
		char[] ch = str.toCharArray();
		for (int i = ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		*/
		
		//using recursivemethod
		
		
		String sc = stringReversing("satish");
	
		System.out.println(sc);
	}
	
	
	public static String stringReversing(String str)
	{
		if((str==null)||(str.length() <= 1))
		{
			return str;	
		}
		
		return stringReversing(str.substring(1)) +str.charAt(0);	
	}
	
	
	

}
