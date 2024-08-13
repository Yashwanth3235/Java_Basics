package Assignments;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CollectionManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CollectionManager<String> setManager = new SetManager<>();

        while (true) {
            System.out.println("Choose operation for Set: (1- Add, 2- Remove, 3- Display, 4- Exit): ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter element to add: ");
                    String elementToAdd = scanner.nextLine();
                    setManager.addElement(elementToAdd);
                    break;
                case 2:
                    System.out.println("Enter element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    setManager.removeElement(elementToRemove);
                    break;
                case 3:
                    setManager.displayElements();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

interface CollectionManager<T> {
    void addElement(T element);
    void removeElement(T element);
    void displayElements();
}

class SetManager<T> implements CollectionManager<T> {
    private Set<T> set;

    public SetManager() {
        this.set = new HashSet<>();
    }

    @Override
    public void addElement(T element) {
        if (set.add(element)) {
            System.out.println(element + " added to the set.");
        } else {
            System.out.println(element + " is already in the set.");
        }
    }

    @Override
    public void removeElement(T element) {
        if (set.remove(element)) {
            System.out.println(element + " removed from the set.");
        } else {
            System.out.println(element + " not found in the set.");
        }
    }

    @Override
    public void displayElements() {
        System.out.println("Set Elements: " + set);
    }
}



