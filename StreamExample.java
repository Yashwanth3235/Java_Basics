import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie", "Jane");

        // Filter names Starting with J
        List<String> filterednames = names.stream().
                                                filter(name -> name.startsWith("J"))
                                                .collect(Collectors.toList());
        System.out.println("names start with j" + filterednames);

        // Convert names to uppercase
        List<String> upperNames = names.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Names in uppercase:" + upperNames);

        // Count names having length greater than 4
        long count = names.stream()
                                .filter(name -> name.length() > 4).count();
        System.out.println("Number of names with length > 4:" + count);

        // Concatenate all names into a single string
        String concatenatedNames = names.stream()
                                        .collect(Collectors.joining(","));
        System.out.println("concatenated names:" + concatenatedNames);

        names.stream()
                    .filter(li -> li.startsWith("J"))
                    .forEach(System.out::println);
        names.stream()
                    .map(li -> li.toUpperCase())
                    .forEach(System.out::println);




    }
}