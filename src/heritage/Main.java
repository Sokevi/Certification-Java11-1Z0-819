package heritage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class Main {

    private  static int i= 0;

    static String l ;

    public static void main(String[] args){


        String value =  "XXIV";

        Object o = (Object) value;

        String t = (String) o;



        Object o1 = new Object();




        System.out.println(l);
/*
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);

        int tot = 0 ;
Stream<Character> charArray = value.chars().mapToObj(i ->(char) i);


              for(int i = 0 ; i < value.length(); i++ ){

            if(i < value. length()-1 && hash.get(value.charAt(i)) < hash.get(value.charAt(i+1))){
                tot = tot + (hash.get(value.charAt(i+1)) - hash.get(value.charAt(i)) );
                i++;
            }
            else{
                tot = tot + hash.get(value.charAt(i));
            }
         }

        System.out.println(tot);*/

        /*HashMap<Integer, String > hashMap = new HashMap<>();

        hashMap.put(null, null);
        hashMap.put(1, null);
        hashMap.put(null, "1");

        hashMap.forEach((key, value) ->
                            {System.out.println(key + ""+ value);} );


        CopyOnWriteArrayList copy =new CopyOnWriteArrayList();

        copy.add(new Object());

        copy.forEach(System.out::println);*/

      /*  ClasseA a = new ClasseA();
       a.doSomething();

       ClasseB b = new ClasseB();
       b.doSomething();

       ClasseA ab =new ClasseB();
       ab.doSomething();

    ClasseB ba = (ClasseB) new ClasseA();
       ba.doSomething();*/


    }
}
