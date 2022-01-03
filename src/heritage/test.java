package heritage;

import java.io.OptionalDataException;
import  java.sql.* ;
public  class test {

    static  class SubTest {
       private int i =10;
    }

    public static void main( String[] e){


        String[]   args  = {"one","two","three"};
        for(int i = 0; i< args.length; i++){
        System.out.println(i +")."+args[i]);
            switch (args[i]){
                case  "one":
                    continue;
                case "two":
                    i--;
                    continue;
                default:
                    break;
            }
        }
    /*  test.SubTest st = new test.SubTest();

      System.out.println(st.i);*/
    }


}
