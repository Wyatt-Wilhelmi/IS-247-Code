import java.util.*;

public class LargestNumber {

	
	
	static int search(int intArray[], int n){
		if(n == 1)
	        return intArray[0];
	         
	        return Math.max(intArray[n-1], search(intArray, n-1));
	    }
	
	public static void main(String args[]) {
		
		int[] intArray = new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		int n = intArray.length;
		
		System.out.println("The maximum value in this array of ten is: " + search(intArray, n));
	}
}
