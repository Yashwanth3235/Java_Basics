package Assignments;

import java.util.Scanner;


public class String_Operations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Extract Substring");
            System.out.println("2. Split a Sentence");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number between 1 and 3: ");
                scanner.next();
            }
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    extractSubstring(scanner);
                    break;
                case 2:
                    splitSentence(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 3);
        
        scanner.close();
    }

    public static void extractSubstring(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.next();
        
        System.out.print("Enter the starting index: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid starting index: ");
            scanner.next();
        }
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter the ending index: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid ending index: ");
            scanner.next();
        }
        int endIndex = scanner.nextInt();
        
        if (startIndex < 0 || endIndex > str.length() || startIndex >= endIndex) {
            System.out.println("Invalid indices. Please ensure that 0 <= startIndex < endIndex <= " + str.length());
        } else {
            String substring = str.substring(startIndex, endIndex);
            System.out.println("Extracted Substring: " + substring);
        }
    }

    public static void splitSentence(Scanner scanner) {
        scanner.nextLine(); // consume the leftover newline
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split("\\s+");
        System.out.println("The sentence split into words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
