package MultiTread;

//performing single task from multiple thread 

public class MultiThreding_5 extends Thread {

	public void run() {
		System.out.println("Run the Thread");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiThreding_5 multithreading_4 = new MultiThreding_5();

		multithreading_4.start();

		MultiThreding_5 multithreading_5 = new MultiThreding_5();

		multithreading_5.start();

		MultiThreding_5 multithreading_6 = new MultiThreding_5();

		multithreading_6.start();
	}

}
