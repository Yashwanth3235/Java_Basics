public class BasicThread
{
    public static void main(String[] args)
    {
        System.out.println("Thread using runnable interface");

        // Create and start two threads
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        thread1.start();
        thread2.start();
        thread1.setPriority(10);
        System.out.println(thread1.getPriority());
    }

    // Runnable implementation defining the task to be performed by the threads
    static class MyRunnable implements Runnable
    {

        private final String name;

        public MyRunnable(String name)
        {
            this.name = name;

        }
        @Override
        public void run()
        {
            // System.out.println("Thread using runnable interface");
            // Print 5 times the name of the thread and the number of the iteration

            for (int i = 0; i < 5; i++)
            {
                System.out.println(name + ":" + i);
                try 
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}