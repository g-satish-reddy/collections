package package2;

public class SecondHighestInArray {

	public static void main(String[] args) {
		
		int[] a={44,66,99,77,33,22,55,0,-55,-22};
		// Initialize these to the smallest value possible
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		// Loop over the array
		for (int i = 0; i < a.length; i++) {

				    // If we've found a new highest number...
		    if (a[i] > highest) {

		        // ...shift the current highest number to second highest
		        secondHighest = highest;

		        // ...and set the new highest.
		        highest = a[i];
		    } else if (a[i] > secondHighest)
		        // Just replace the second highest
		        secondHighest = a[i];
		    }
		
		System.out.println(secondHighest);
		}

		// After exiting the loop, secondHighest now represents the second
		// largest value in the array

	}


