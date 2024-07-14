package MultiTread;

//Using interface
public class MultiThreding_2 implements Runnable {

	public void run() {
		System.out.println("Interface Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiThreding_2 multithread_2 = new MultiThreding_2();
		
		Thread thread = new Thread(multithread_2);
		
		thread.start();

	}

}
