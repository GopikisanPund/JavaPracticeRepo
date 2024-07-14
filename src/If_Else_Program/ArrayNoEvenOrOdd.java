package If_Else_Program;

public class ArrayNoEvenOrOdd {
	
	    public static void main(String[] args) {
	        int[] numbers = {2, 5, 10, 7, 8}; 
	        
	        for (int number : numbers) 
	        {
	            if (number % 2 == 0) 
	            {
	                System.out.println(number + " is even.");
	            }
	            else 
	            {
	                System.out.println(number + " is odd.");
	            }
	        }
	    }
	}

