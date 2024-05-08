// An enum, or enumeration, in Java is a special data type that allows you to define a collection of named constants. 
// It provides a way to represent a fixed set of predefined values. Each value in an enum is treated as a separate instance of the enum type.
public class Enumdemo {
    
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    public static void main(String[] args) {


        Day today = Day.FRIDAY;
        
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday.");
                break;
            case FRIDAY:
                System.out.println("Today is Friday.");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday.");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}


 /**
  * Enumdemo
  */
/*  public class Enumdemo {
 
    enum color {
        Red, blue, yellow, black, white;
    }

    public static void main(String[] args) {
        System.out.println(color.Red);
        System.out.println(color.blue);
        System.out.println(color.black);
        System.out.println(color.yellow);

    }
 } */