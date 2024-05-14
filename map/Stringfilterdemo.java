package map;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;;


public class Stringfilterdemo {

    public static void main(String[] args) {
        
    
    Set <Games> game =  new HashSet <Games>();
    game.add(new Games(1,"PUBG",5));
    game.add(new Games(2,"IGI",4));
    game.add(new Games(3,"WWE",5));
    game.add(new Games(4,"Cricket",3));
    game.add(new Games(5,"Baseball",2));

    List <Games> g1 = game.stream()
                                .filter(g->g.rating >= 3)
                                .collect(Collectors.toList());
    System.out.println(g1);
}
}

class Games {
    public int id;
    public String name;
    public float rating;


public Games(int id, String name, float rating){
    this.id = id;
    this.name = name;
    this.rating = rating;
}

public String toString(){
    return "id: " + id + " name: " + name + " rating: " + rating;
}
}

