
// A HashMap in Java is a data structure that stores key-value pairs, providing fast retrieval and insertion operations based on the hash code of the keys. 
// It allows unique keys and permits null values, utilizing hashing techniques to efficiently manage and access the stored elements.

import java.util.HashMap;
import java.util.Map;

public class Hashmapexample {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        HashMap <Integer, String> Map = new HashMap<Integer, String>();
        Map.put(1, "Mango"); //put elements in map
        Map.put(2, "Banana");
        Map.put(3, "Orange");
        Map.put(1, "Strawberry");   //trying duplicate iteration (key: 1)

        System.out.println("Iteration HashMap");
        for (Map.Entry m : Map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
