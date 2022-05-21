package package2;

public class StringRotation {

	public static void main(String[] args) {
		String s1 = "welcomehome";
		String s2 = "homecomming";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("s2 is not rotation versio of s1");
		}
		else
		{
			String s3 = s1+s1;
			
			if(s3.contains(s2))	
			{
				System.out.println("s2 is rotational versionof s1");
			}
			else
			{
				System.out.println("s2 is not rotational versionof s1");
			}
		}
	}
}
