package Thread;
public class Threaddemo
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.start();
        System.out.println(e1.getName());
        System.err.println("error message");
    }
}

class Employee extends Thread
{
    public void run()
    {
        System.out.println("Thread Started");
    }
}