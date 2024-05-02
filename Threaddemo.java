public class Threaddemo
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.start();
    }
}

class Employee extends Thread
{
    public void run()
    {
        System.out.println("Thread Started");
    }
}