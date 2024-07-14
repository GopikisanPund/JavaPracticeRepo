package MultiTread;

import java.util.Iterator;

public class SleepMethod {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		for(int i = 1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(1000);
				System.out.println(i);
				
			} catch (Exception e) 
			{
			 e.printStackTrace();
			}
			
		}
		System.out.println("Exist from the loop");

	}

}
