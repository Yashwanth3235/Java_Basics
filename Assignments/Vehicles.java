package Assignments;

public class Vehicles {

    
    protected String vehicleType;
    protected String vehicleName;


public  Vehicles(String vehicleType, String vehicleName){
    this.vehicleType = vehicleType;
    this.vehicleName = vehicleName;
}

public void DisplayMessage(){
    System.out.println("The vehicle type is: " + vehicleType);
    System.out.println("The vehicle name is: " + vehicleName);
}

public static void main(String[] args) {
    Vehicles Vehicle = new Vehicles("Two Wheeler", "Tvs victor");
    Vehicle.DisplayMessage();

    Bike biker = new Bike("two wheeler", "Apache rr 310", "sports type");
    biker.DisplayMessage();
}
}

class Bike extends Vehicles{

    // Instance
    private String bikeType;

    // Constructor
    public Bike(String vehicleType, String vehicleName, String bikeType){
        super(vehicleType, vehicleName);
        this.bikeType = bikeType;
    }

    // Display method
    @Override
    public void DisplayMessage(){
        super.DisplayMessage();
        System.out.println("The bike type is: " + bikeType);
    }

  
}

