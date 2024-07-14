package ForLoop;

public class StartPattern {

	public static void main(String[] args) {
		

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int k = 10; k >= 1; k--) {
			for (int n = k; n >= 1; n--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}

/*
 * 
 * // Printing the inverted triangle for(int k = 10; k >= 1; k--) { for(int n =
 * k; n >= 1; n--) { System.out.print("*"); } System.out.println(); // Add this
 * line to move to the next line after each row } } }
 * 
 */
