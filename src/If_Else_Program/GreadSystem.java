package If_Else_Program;

import java.util.Scanner;

public class GreadSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Check Your marks");
			int marks=scanner.nextInt();
			
			if (marks<=35) 
			{
				System.out.println("You are failed");
			}
			else if (marks<=40 && marks <=50)
			{
				System.out.println("D grade");
			}
			else if (marks>=50 && marks<=60) 
			{
			System.out.println("Second distiction");	
			}
			else if (marks>=60 && marks<=70) 
			{
			System.out.println("First distiction");	
			}
			else if (marks>=70 && marks<=80) 
			{
			System.out.println("First distiction grade b");	
			}
			else if (marks>=90 && marks<=100) 
			{
			System.out.println("first class with  distiction");	
			}
			else {
				System.out.println("please select valide number");
			}
		}
		
		
	}

}
