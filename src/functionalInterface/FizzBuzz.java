package functionalInterface;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static String convert(int x){
        if(x % 15 ==0) return "FizzBuzz";
        else if(x % 3 ==0) return "Fizz";
        else if(x % 5 ==0) return "Buzz";
        else return  Integer.toString(x);
    }
    public static void main(String... strings){
        for(int i=0; i<101; i++) {
            System.out.print(convert(i));
        }

        System.out.println("");

        IntStream.rangeClosed(1,100).mapToObj(FizzBuzz::convert).forEach((System.out::print));

    }
}
