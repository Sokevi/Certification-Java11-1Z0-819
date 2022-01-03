package stream;

import java.util.Arrays;
import java.util.List;

public class MAin {

    public static void main(String... strings){

        List<Integer> numbers = List.of(2,3,0,8,1,9,5,7,6,4);

        var allStrrem = numbers.stream();

        var streamFilter = allStrrem.filter(x ->x>2).peek(System.out::println);

        System.out.println("---------------");

        var streamFiltere  = streamFilter.map(x->x*2).peek(System.out::println);

        var sume = streamFiltere.count();

        System.out.println(sume);

        /*
        int sum = numbers.stream().reduce(0,(n,m) -> n+m);
        int sum1 = numbers.parallelStream().reduce(0,(n,m) -> n+m);
        int sum2 =numbers.stream().parallel().reduce(0,(n,m) -> n+m);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
*/

    }
}
