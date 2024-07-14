package SimpleJavaProgram;

import java.util.Scanner;

public class ScannerClass_2 {

	public static void main(String[] args) {
	
		System.out.println("Create The Addition Of Two Number");
		
		Scanner srcScanner = new Scanner(System.in);

		System.out.println("Enter the First Number");
		int no1 = srcScanner.nextInt();
		
		System.out.println("Enter the Second Number");
		int no2 = srcScanner.nextInt();
		
		int no3 = no1+no2;
		
		System.out.println("Addition of two number "+ no3);
		
	}

}
