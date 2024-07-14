package MultiTread;

public class MultiThreding_1 extends Thread {
	
	public void run() 
	{
		
		System.out.println("Run the Thread");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiThreding_1 multiThrading_1 = new MultiThreding_1();
		
		multiThrading_1.start();

	}

}
