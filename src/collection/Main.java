package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    List<? super Short> list1 = new ArrayList<Number>();
   // List<? super Number> list2 = new ArrayList<Integer>();
  //  List<? super Number> lis3 = new ArrayList<Byte>();
    List<? super Number> list4 = new ArrayList<Object>();
  //  List<? super Float> list5 = new ArrayList<Double>();


    static Map<String, String> map = new HashMap<>();
    static List<String> keys = new ArrayList<>(List.of("S","P","Q","R"));
    static String[] values ={"senate","People", "of","rome"};

    static {
        for (var i=0;i<keys.size();i++){
            map.put(keys.get(i),values[i]);
       }
    }
    public static void main(String... strings){
        keys.clear();
        values = new String[0];
        System.out.println("keys: "+ keys.size()+ values.length + map.size());

    }
}
