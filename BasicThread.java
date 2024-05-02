public class BasicThread
{
    public static void main(String[] args)
    {
        // Create and start two threads
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        thread1.start();
        thread2.start();
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