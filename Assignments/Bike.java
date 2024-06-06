package Assignments;

public class Bike {
            String brand;
            String model;
            int year;

            // Constructor for class Bike
            public Bike(String brand, String model, int year){

                this.brand = brand;
                this.model = model;
                this.year = year;
            }

            public void display(){
                System.out.println("Brand: " + brand);
                System.out.println("model: " + model);
                System.out.println("year: " + year);
            }

            public static void main(String[] args) {
                Bike bike1 = new Bike("Apache", "RTR 310", 2016);
                Bike bike2 = new Bike("Yamaha", "R15", 2020);
                Bike bike3 = new Bike("BMW", "RR310", 2018);
                bike1.display();
                bike2.display();
                bike3.display();

                
            }
        }

    
