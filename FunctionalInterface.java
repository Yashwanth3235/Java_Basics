// Java 8 features

interface Sayable {
    void say(String msg);
}

public class FunctionalInterface implements Sayable{

    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInterface obj = new FunctionalInterface();
        obj.say("Hello");
        obj.say("Yashwanth");
    }
    
}
