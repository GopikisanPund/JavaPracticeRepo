package MultiTread;

public class Multithreding_3 extends Thread {

    //private static Object st;

    public void run() {
        System.out.println("Run the Thread");
    }

    public static void main(String[] args) {
        // Creating an instance of the Multithreding_3 class
        Multithreding_3 multithreding_3 = new Multithreding_3();
        
        // Starting the thread
        multithreding_3.start();
    }
}
