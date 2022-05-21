package package2;

public class MaxAndMin_InArray {

	public static void main(String[] args) {
		int a[]={44,66,99,99,77,33,22,55,0,-55,-22};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println(max);
		System.out.println(min);
		
		 for(int i = 0; i<a.length; i++)
		 {

	            if(a[i]>max)
	            {
	                max = a[i];
	            }
	            if(a[i]<min)
	            {
	                min = a[i];
	            }
	            
		 }

	        System.out.print("The maximum number is:" + max);
	        System.out.println();
	        System.out.print("The minimum number is: " + min);

	}

}
