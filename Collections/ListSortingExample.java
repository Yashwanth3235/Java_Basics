package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingExample {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("apple");
        list.add("watermelon");
        list.add("cherry");
        list.add("grapes");

 

// Sort the list in natural order
Collections.sort(list);

// Print the sorted list
for (String element : list)
{
    System.out.println(element);
}
    }
}