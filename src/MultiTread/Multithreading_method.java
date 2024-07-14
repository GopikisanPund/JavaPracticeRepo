package MultiTread;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Multithreading_method extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("Thread Name");

		// current thread
		System.out.println(Thread.currentThread().getName());

		// set new Thread name
		Thread.currentThread().setName("Gopikisan Thread");

		System.out.println(Thread.currentThread().getName());

		boolean result;
		result = Thread.currentThread().isAlive();
		
		System.out.println(result);

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not division by 0");
		}

	}

}
