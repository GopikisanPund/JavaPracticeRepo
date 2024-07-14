package ForLoop;

import java.util.Scanner;

public class SimpleLoop {

	public static void main(String[] args) {

		Scanner srcScanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = srcScanner.nextInt();

		for (int i = 1; i <= no; i++) {
			System.out.println("The No is: " + i);

			if (i % 2 == 0) {
				System.out.println("No is even " + i);
				continue;
			}
			else {
				
				System.out.println("No is odd");
			}
			

		}

	}

}
