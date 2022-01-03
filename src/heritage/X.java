package heritage;

import functionalInterface.Function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class X {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){ return getName(); }
}

class Y extends X{
    public Y(String name){
        super();
        setName(name);
    }
    public static void main(String... strings){
      /*  Y y = new Y("HH");
        System.out.println(y);
        var fruits = List.of("apple", "orange", "banana", "lemon");
        Optional<String> result = fruits.stream().filter(f -> f.contains("n")).findFirst (); ///////////////////////////

      */List<String> list1 = new ArrayList<>(List.of("Plane", "Automobile","MotorCyle"));

        List<String> list2 = new ArrayList<>(List.copyOf(list1));

        list1.sort((String item1, String item2) -> item1.compareTo(item2));
        list2.sort((String item1, String item2) -> item1.compareTo(item2));

        System.out.println(list1.equals(list2));
    }
}

class TripleThis {

    public static void main(String... strings){

        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        String a ="abc";
         System.out.println(a =="abc");
        Function<Integer,Integer> tripler = x -> {
            return (Integer) x *3 ;
        };
        TripleThis.printValue(tripler, 4);
    }

    public static <T> void printValue(Function<T, T> f, T num){
        System.out.println(f.apply(num));
    }
}
