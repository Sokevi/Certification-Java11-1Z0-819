package functionalInterface;

import java.sql.Types;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String... strings){
        java.util.function.Consumer<String> c1 = arg -> System.out.println(arg);
        c1.accept("c1 accepted");
        Consumer<String> c2 = arg -> System.out.println(arg);
        c2.accept("c2 accepted");
        c2.andThen(c1).accept("after then");
        c2.accept("c2 accepted again ");
        System.out.println();
        System.out.println();
        String[] towns = {"boston", "paris","bangkok", "oman"};
        Comparator<String> ms =(a,b) ->b.compareTo(a);
        Arrays.sort(towns,ms);  //bangkok boston oman paris

        System.out.println(Arrays.binarySearch(towns,"oman",ms));


        UnaryOperator<Integer> uo = (var x) -> x*3;
     //   UnaryOperator<Integer> uo1 = var x -> (x*3);
        UnaryOperator<Integer> uo2 =  x -> (x*3);
        UnaryOperator<Integer> uo3 = (var x) -> (x*3);

    }
}
