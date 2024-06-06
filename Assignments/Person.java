package Assignments;

public class Person {
    // instance variables
        String name;
        int age;


        // Constructor
    public Person(String name, int age){
        
        this.name =name;
        this.age=age;
    }

    // To display details
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

        public static void main(String[] args) {

            // Creating Objects
            Person Person1 = new Person("John", 25);
            Person Person2 = new Person("Alice", 30);
            Person1.display();
            Person2.display();
    }
}