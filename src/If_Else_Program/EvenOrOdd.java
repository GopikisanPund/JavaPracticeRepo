package If_Else_Program;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {


		Scanner srcScanner=new Scanner(System.in);
		System.out.println("Enter the number to check number is odd or even");
		int no = srcScanner.nextInt();
		
		if(no % 2 == 0)
		{
			System.out.println("Number is even ");
		}
		else 
		{
			
			System.out.println("Number is odd");
		}

	}

}
