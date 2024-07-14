package SimpleJavaProgram;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);
		System.out.println("Enter the sub marks");

		System.out.println("Marathi: ");
		int mar = src.nextInt();
		System.out.println("Hindi: ");
		int Hindi = src.nextInt();
		System.out.println("English: ");
		int Eng = src.nextInt();
		System.out.println("Histry: ");
		int Histry = src.nextInt();
		System.out.println("Math: ");
		int Math = src.nextInt();
		
		int Totle = mar+Hindi+Eng+Histry+Math;
		
		int persentage = (Totle*100/500);
		
		System.out.println("The Persentage of Student is " + persentage);

	}

}
