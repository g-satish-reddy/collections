package package2;

public class practice2 {

	public static void main(String[] args) {
		String str = "123str8in99g0125";
		char[] chart = str.toCharArray();
		for(char ch:chart)
		{
			if(Character.isDigit(ch))
			{
				System.out.println(ch);
			}
		}

	}

}
