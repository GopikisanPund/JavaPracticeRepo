package WhileLoop;

public class whileSimpleProgram {

	public static void main(String[] args) {

		int i = 1;

		while (i<=10) 
		{
			System.out.println("Hello Gopikisan :  " +i);
			
			if (i==1) 
			{
				System.out.println("same");
				break;	
			}
			else {
				
				System.out.println("not same");
				i++;
			}
			
		}

	}

}
