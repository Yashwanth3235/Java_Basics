package Assignments;

public class Employee {
    int id;
    String first_name;
    String last_name;

    // Constructor for class Employee
    public Employee(int id, String first_name, String last_name){
        this.id=id;
        this.first_name=first_name;
        this.last_name=last_name;
    }

    // Creating method with no parameters
    public void Display(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee First Name: "+first_name);
        System.out.println("Employee Last Name: "+last_name);
    }

    // Creating method with one parameter
    // method overloading because using same method
    public void Display(boolean show_id){
        if(show_id){
            System.out.println("Employee ID: "+id);
        }
        System.out.println("Employee First Name: "+first_name);
        System.out.println("Employee Last Name: "+last_name);
    }

    // Creating method with two parameters
    // method overloading because using same method
    public void Display(String Emplyee3, boolean show_name){
        System.out.println(Emplyee3);
        System.out.println("Employee ID:" + id);
        if(show_name){
            System.out.println("Employee First Name: "+first_name);
    }
    System.out.println("Employee Last Name: "+last_name);
}

// Main method to add objects to the instances
public static void main(String[] args){
    Employee emp1 = new Employee(1, "Yashwanth", "Kumar");
    Employee emp2 = new Employee(2, "lakshmi", "Kanth");
    Employee emp3 = new Employee(3, "Rakshith", "Amin");

    emp1.Display();
    emp2.Display(true);
    emp3.Display("3rd Employee details: ", true);
}
}

