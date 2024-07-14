package If_Else_Program;

import java.util.Scanner;

public class NestedIf_else {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);
		System.out.println("Check you are eligible for donate blood or not");

		System.out.println("Enter age");
		int age = src.nextInt();

		System.out.println("Enter weigth");
		int weitgh = src.nextInt();

		if (age >= 18) {
			if (weitgh >= 50) {
				System.out.println("You are eligible for bloode donation");

			} else {
				System.out.println("weight is less than 50");
			}
		} else {
			System.out.println("u are under age or your weight is also low ");
		}

	}

}
