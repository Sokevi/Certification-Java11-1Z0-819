package agoraTemple;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.*;

import  static  java.lang.System.out;
public class TestClass {


    double d;
    long l;
    public static int take() throws Exception{
        throw new Exception();

    }
    public static void main(String args[ ] ){

        int i =10;
        int j =5;

        out.println(i);

        i = ( j * 5 +j) /i - 2;
        out.println(i);

        String[][] names = {
                {"Alex", "Bob"},
                {"Emily", "Jean", "James"},
                {"Ali", "Yohan"},
                {"Emily", "Jean", "James"},
                {"Ali", "Yohan"},
                {"Emily", "Jean", "James"},
                {"Ali", "Yohan"}
        };
        System.out.println(names.length);

        char s = 'y';
        char l =s;
        l='u';

        long c = s;

    }
    public static void incr(int   n ) { n++ ; }
    public static void incr(int[ ] n ) { n [ 0 ]++ ; }
}