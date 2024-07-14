package If_Else_Program;

import java.security.Identity;

public class checkNoisPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 0;
		boolean isprime=true;
		
		if (no<=1) 
		{
			isprime=false;
		}
		else {
			for(int i = 2;i<=Math.sqrt(i);i++)
			{
				if(no%2==0)
				{
					isprime=false;
					break;
				}
			}
		}
		if(isprime)
		{
			System.out.println("No is Prime " + no);
			
		}
		else 
		{
		  System.out.println("No is Not Prime " + no);	
		}
	}

}
