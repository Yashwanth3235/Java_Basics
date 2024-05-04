class Generic <T extends Number> {

    public void display()
    {
        System.out.println("this is about generic class");
    }
}
class GenericClass{
public static void main(String[] args)
{
    Generic<Integer> obj = new Generic <>();
    obj.display();
}
 }