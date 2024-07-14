package Array;

import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
		
		int arr[]= {10,20,40,50,60,7080,578};
		
		Arrays.sort(arr);
		
		System.out.println("The largest No is : " + arr[arr.length-1]);

	}

}
