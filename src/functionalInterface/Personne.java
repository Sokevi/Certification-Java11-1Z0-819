package functionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Personne {
    int age;
    String name;

    Personne(int age , String name){
        this.age =age ;
        this.name =name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String... strings){
        List<Personne> personnes =new ArrayList(List.of(new Personne(44,"Tom"),
                new Personne( 40,"Aman"),new Personne(40,"Peter")));

       personnes.sort(Comparator.comparing((Personne::getName))
              // .thenComparing(Personne::getName)
               .reversed());

       personnes.forEach(p1 -> System.out.print(""+p1.getName()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
