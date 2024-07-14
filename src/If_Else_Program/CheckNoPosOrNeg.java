package If_Else_Program;

import java.util.Scanner;

public class CheckNoPosOrNeg {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number");
		int i = scanner.nextInt();

		if (i > 0) {
			System.out.println("Number is Positive");
		} 

		else if (i<0) {
			
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is Zero");
		}

	}

}
