package SwitchStatements;

import java.util.Scanner;

public class CheckOvels {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Ovels");
		char ch= scanner.next().charAt(0);
		
		switch (ch) {
		case 'a':
			System.out.println("Ovels");
			break;
		case 'e':
			System.out.println("Ovels");
			break;
		case 'i':
			System.out.println("Ovels");
			break;
		case 'o':
			System.out.println("Ovels");
			break;
		case 'u':
			System.out.println("Ovels");
			break;
		default:
			System.out.println("It is not Ovels");
			break;
		}

	}

}
