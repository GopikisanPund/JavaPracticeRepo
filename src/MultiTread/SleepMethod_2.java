package MultiTread;

public class SleepMethod_2 extends Thread
{
	public void run()
	{
		try {
			for(int i = 1; i<=5; i++)
			{
				Thread.sleep(1000);
			String name = Thread.currentThread().getName();
			System.out.println(name);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SleepMethod_2 method_2 = new SleepMethod_2();
		method_2.start();
		SleepMethod_2 method_22= new SleepMethod_2();
		method_22.start();

	}

}
