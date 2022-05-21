package package2;

public class PrintNumWithoutLoop {

	public static void main(String[] args) 
	{
		printNumber(1, 10);

	}
	
	public static void printNumber(int from, int to)
	{
		if(from<=to)
		{
		System.out.println(from);
		printNumber(from+1, to);
		}
	}
	
	
}
