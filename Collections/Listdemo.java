package Collections;
// import java.util.Stack;
// import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Listdemo {

    public static void main(String[] args) {
    
    List <String> List1 = new ArrayList<>();
    List <String> List2 = new LinkedList<>();
    List <String> List3 = new Vector<>();
    List <Integer> List4 = new Stack<>();

        List1.add("apple");
        List1.add("Banana");
        for(String li : List1)
        System.out.println(li);

        List2.add("Mango");
        List2.add("Grapes");
        for(String li : List2)
        System.out.println(li);

        List3.add("Orange");
        List3.add("Pineapple");
        for(String li : List3)
        System.out.println(li);

        List4.add(300);
        List4.add(10);
        for(int li : List4)
        System.out.println(li);
    }
}
