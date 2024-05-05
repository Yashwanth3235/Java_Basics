import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorExample {
    
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList <String> bikes = new ArrayList<>();

        // Add some new bikes
        bikes.add("Honda");
        bikes.add("TVS");
        bikes.add("Hero");
        bikes.add("Bajaj");


        // Sorting the bikes
        Collections.sort(bikes);

        // Get an Iterator for the ArrayList
        Iterator <String> iterator = bikes.iterator();

        // Iterate through the ArrayList using the iterator
        while (iterator.hasNext())
        {
            // String bikecompany = iterator.next();
            // System.out.println(bikecompany);

            String temp = iterator.next();
            System.out.println(temp);
            
        }
    }
}

