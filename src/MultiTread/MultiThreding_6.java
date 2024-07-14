package MultiTread;

public class MultiThreding_6 extends Thread 
{

    public void run() 
    {
        System.out.println("Task 1 is started ");
    }

    public static class MultiThread extends Thread 
    {
        public void run() 
        {
            System.out.println("Task 2 is started ");
        }
    }

    public static void main(String[] args)
{
        // Creating instances of the thread classes
        MultiThreding_6 thread1 = new MultiThreding_6();
        MultiThread thread2 = new MultiThread();

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
