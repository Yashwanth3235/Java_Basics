package Assignments;

public interface Classes {
    void first_class();
    void second_class();

    public static void main(String[] args) {
        Classes class1 = new Computer(); 
        Classes class2 = new Physics();
    
        class1.first_class();
        class1.second_class();
    
        class2.first_class();
        class2.second_class();
    }


    public class Computer implements Classes{
        public void first_class() {
            System.out.println("Computer classes are running in first class");
        }
    
        @Override
        public void second_class() {
            System.out.println("Computer classes are running in second class");
    }
} 

    public class Physics implements Classes{

        public void first_class() {
            System.out.println("Physics classes are running in first class");
    }

    @Override
    public void second_class() {
        System.out.println("Physics classes are running in second class");
    }
}
}
