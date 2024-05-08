
class hello
{
    public static void main(String[] args){
        System.out.println("Hello World");
        innermethod();
        
    }

    static void innermethod()
    {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
}