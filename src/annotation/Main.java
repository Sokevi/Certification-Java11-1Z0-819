package annotation;

import functionalInterface.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    @SuppressWarnings("all")
    public static void main(String... strings){
        /*List l =new ArrayList();
        l.add("hello");
        l.add("world");
        print(l);*/
        List<Integer> list = List.of(2,1,3,4,5);
        list.parallelStream().forEach(System.out::print);
        /*System.out.println("((((((((((((((())))))))))))");
        System.out.println("((((((((((((((())))))))))))");
        System.out.println("((((((((((((((())))))))))))");

        List<String> longlist = List.of("Hello", "Word", "Beat");
        List<String> shortlist = new ArrayList<>();

        longlist = longlist.stream()
                .filter(w -> w.indexOf('e') != -1)
                .parallel()
                .collect(Collectors.toList());

        longlist.forEach(System.out::println);
*/
    }

    @SuppressWarnings("all")
    private static void print(List<String>... args){
        for(List<String> str : args){
            System.out.print(str);
        }

 }
}

