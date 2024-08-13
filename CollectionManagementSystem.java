import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CollectionManager<String> listManager = new ListManager<>();

        while (true) {
            System.out.println("Choose operation for List: (1- Add, 2- Remove, 3- Display, 4- Exit): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter element to add: ");
                    String elementToAdd = scanner.nextLine();
                    listManager.addElement(elementToAdd);
                    break;
                case 2:
                    System.out.println("Enter element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    listManager.removeElement(elementToRemove);
                    break;
                case 3:
                    listManager.displayElements();
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

class ListManager<T> implements CollectionManager<T> {
    private List<T> list;

    public ListManager() {
        this.list = new ArrayList<>();
    }

    @Override
    public void addElement(T element) {
        list.add(element);
        System.out.println(element + " added to the list.");
    }

    @Override
    public void removeElement(T element) {
        if (list.remove(element)) {
            System.out.println(element + " removed from the list.");
        } else {
            System.out.println(element + " not found in the list.");
        }
    }

    @Override
    public void displayElements() {
        System.out.println("List Elements: " + list);
    }
}


