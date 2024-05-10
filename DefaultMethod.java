interface Sayable{
    // Default method
    default void say(){
    System.out.println("This is default method");
}
// Abstract method
void sayMore(String msg);

// Static
static void Saylouder(String msg){
    System.out.println(msg);
}
}
public class DefaultMethod implements Sayable{

    public void sayMore(String msg){   //implementing abstract method
        System.out.println(msg);
    }
    public static void main(String[] args) {
        DefaultMethod dm = new DefaultMethod();
        dm.say(); //call default method
        dm.sayMore("Work is worship"); //Call Abstract method
        Sayable.Saylouder("hello world"); 
}
}
