public class Genericinferencetype {
    public static void main(String[] args) {
        student <String> std = new student<>();
        std.setname("Yashwanth");
        std.setname("Vamsi");
        System.out.println(std.getname());

}
}

class student <X> {
    X name;


public void setname(X name){
    this.name = name;
}

public X getname(){
    return name;
}
}