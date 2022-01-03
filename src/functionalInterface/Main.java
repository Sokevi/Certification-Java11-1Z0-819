package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String... strings){
        List fruits = Arrays.asList("apple","orange","banana");
        java.util.function.Consumer<String> c =System.out::print;

        Consumer<String> output = c.andThen(x -> System.out.println(":"+x.toUpperCase()));

        fruits.forEach(output);
    }
}
