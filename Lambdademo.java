//  Lambda Expressions in Java are the same as lambda functions which are the short block of code that accepts input as parameters and returns a resultant value. 
// Lambda Expressions are recently included in Java SE 8. 

public class Lambdademo {
    public static void main(String[] args) {
        audi a1 = new audi();
        a1.start();
        BMW b1 = new BMW();
        b1.start();
    
    Car c1 = new Car() {
        @Override
        public void start() {
            System.out.println("Ananamous car");
        }
    };
    c1.start();

    // Lambda expression
    Car car1 = () -> {
        System.out.println("Lambda car");
        
    };
    car1.start();

}
}


interface Car {
    public abstract void start();
}

class audi implements Car{
    @Override
    public void start() {
        System.out.println("audi start");
}
}
class BMW implements Car{
    @Override
    public void start() {
        System.out.println("BMW start");
}
}