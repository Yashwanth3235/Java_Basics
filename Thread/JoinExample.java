// import java.lang.Thread;

package Thread;
public class JoinExample {
    public static void main(String[] args) {
        MyThread  thread_1 = new MyThread ("Thread 1");
        MyThread  thread_2 = new MyThread ("Thread 2");

        thread_1.start();
        thread_2.start();

        try {
            // wait for thread_1 to finish
            thread_1.join();
            System.out.println("Thread_1 has finished. now waiting for thread_2 to finish");

              // wait for thread_2 to finish
              thread_2.join();
              System.out.println("Thread_2 has finished. now back to main thread");
        }
            catch (InterruptedException e){
                System.out.println("main thread is interrupted");
            }
                System.out.println("main method is finished");
    }
}


class MyThread  extends Thread {
    public String name;

    public MyThread (String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " " + "is starting");

        try {
            Thread.sleep(2000);  //simulate some work with a 2 seconds sleep
            } catch (InterruptedException e) {
                System.out.println(name + " " + "was interrupted");
            }
            System.out.println(name + " " + "has finished");
    }
}