package Assignments;

class BikeCompany {

    public void displayMsg(){
        System.out.println("Welcome to Bike Company");
    }

    public static void main(String[] args) {
        // Creating an instance to the bike comapany
        BikeCompany bike = new BikeCompany();
        bike.displayMsg();

        // Creating an instance to the Moto company
        BikeCompany moto = new Moto();
        moto.displayMsg();

        BikeCompany honda = new Honda();
        honda.displayMsg();

    }
}

class Moto extends BikeCompany {

    @Override
    public void displayMsg(){
        System.out.println("Welcome to Moto");
    }
}

class Honda extends BikeCompany {

    @Override
    public void displayMsg(){
        System.out.println("Welcome to Honda");
    }
}