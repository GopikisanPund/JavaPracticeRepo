package MultiTread;

public class ThreadPriority extends Thread {
	public void run() {
		System.out.println("Chilld class thread priority " + Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {

		int no = Thread.currentThread().getPriority();

		Thread.currentThread().setPriority(10);

		System.out.println("main Thread Priority " + no);

		ThreadPriority priority = new ThreadPriority();

		priority.start();

	}

}
