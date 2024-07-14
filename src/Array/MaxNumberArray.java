package Array;

public class MaxNumberArray {

	static int arr[] = { 100, 200, 4000, 5000, 666, 66478 };

	static int largest() {
		int i;

		int max = arr[0];

		for (i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;

	}

	public static void main(String[] args) {
		
		System.out.println("The largest Number is + " + largest() );

	}

}
