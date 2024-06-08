package Assignments;

abstract class Cricket{

    public abstract void Greet();

    public static void main(String[] args) {
        // Cannot create an instance of an abstract class

        // Create instances of the subclasses
        Cricket team1 = new Team1();
        Cricket team2 = new Team2();

        team1.Greet();
        team1.Match_Results();

        team2.Greet();
        team2.Match_Results();
    }

    public void Match_Results() {
        System.out.println("Good Game");
    }
}

    class Team1 extends Cricket {

        @Override
        public void Greet(){
            System.out.println("Hello from Team 1");
        }
    }

    class Team2 extends Cricket {

        @Override
        public void Greet(){
            System.out.println("Hello from Team 2");
        }
    }
