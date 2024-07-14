package MultiTread;

public class SleepMethod_1 extends Thread
{
	public void run()
	{
		try
		{
		for(int i = 1;i<=5;i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}
		}
		catch (Exception e) 
		{
		e.printStackTrace();
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SleepMethod_1 method_1 = new SleepMethod_1();
		
		method_1.start();

	}

}
