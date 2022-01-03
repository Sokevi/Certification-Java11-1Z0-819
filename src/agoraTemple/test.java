package agoraTemple;

import java.nio.BufferOverflowException;
import java.sql.Array;
import java.text.NumberFormat;
import java.util.*;

public class test  {


    /*{
        System.out.println("instance bloc  ");
    }*/

/*
    static {

        System.out.println("class bloc");
    }
*/


    public static void main(String[] args) {

        // get the runtime object associated with the current Java application
        Runtime runtime = Runtime.getRuntime();

        // get the number of processors available to the Java virtual machine
        int numberOfProcessors = runtime.availableProcessors();

        System.out.println("Number of processors available to this JVM: " + numberOfProcessors);

        Map<Integer, String > map = new HashMap<>();

        map.put(1,"Un ");
        map.put(null,"Un ");
        map.put(null,"Un ");
        Object obj1 = new Object();
        Object obj2 = obj1;

        Float f1 = 10.0f;
        Float f2 = 0.0f;

        Float f3 = null;

        double f = 0.0;
        try{
            f = f1/f2;
            System.out.println(f);
            f3 = f1/f2;
        }catch(Exception e){
            System.out.println("Exception");
        }

        System.out.println(f3.isInfinite());
//
//        List<String> strings = List.of("one", "two", "three");
//        System.out.println(strings);
//        List<String> strings1 = new ArrayList<>(strings);
//        strings1.add("four");
//        System.out.println(strings1);
//        Collections.unmodifiableCollection(strings1);
//        strings1.add("test");
//        System.out.println(strings1);




     /*   String city ="9336110";

        Double doubleVal = Double.valueOf(city);

        System.out.println(city.contains("113"));*/

//        var list = new TreeSet<Integer>();
//
//        list.add(5);
//        list.add(1);
//        list.add(0);
//        list.add(1);
//        list.add(6);
//        list.add(1);
//
//        System.out.println(list);
//        var list2 = new ArrayList<Integer>();
//
//        list2.add(5);
//        list2.add(1);
//        list2.add(0);
//        list2.add(1);
//        list2.add(6);
//        list2.add(1);
//
//        System.out.println(list2);

//        test t = new test();
//
//        System.out.println("In main");
////        // Primitive value :
////        //for Number :  Real number : byte, short,int long  Virgule: float double
////
////        long longVal = 100;
////        int intVal = (int) longVal;
////
////
////        int int2Val = 5;
////        longVal = (long) int2Val;
////
////        Double doubleVal = (double) int2Val;
////
////        System.out.println(doubleVal);
//
//
///*
//       String java1 ="java";
//        String java11 =java1.concat("a");
//        String java2 = new String("java");
//        String java3 = new String("java");
//
//        System.out.println(java1== java11);
//*//*
//

    }
}
