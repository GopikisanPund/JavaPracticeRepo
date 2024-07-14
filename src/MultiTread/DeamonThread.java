package MultiTread;

public class DeamonThread extends Thread {
	public void run() 
	{
		if (Thread.currentThread().isDaemon()) {
			System.out.println("It is Daemon Thread");
		} else {

			System.out.println("chiled thread");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("chiled thread");
		

		DeamonThread deamonThread = new DeamonThread();
		

		deamonThread.setDaemon(true);

		deamonThread.start();
		
		boolean result = Thread.currentThread().isAlive();
		
		System.out.println(result);
		
//		try {
//			
//			Thread.sleep(1000);
//			
//		} catch (Exception e) {
//	
//			e.printStackTrace();
//		}

	}

}
