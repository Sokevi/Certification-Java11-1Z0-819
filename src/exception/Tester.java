package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester {
    static  Integer j;
    public static void main(String... steings){





        int i ;
        int j =3;
        int f =4;
        int g =i = j = f;

        System.out.println(g);
        try{
            doA();
            doB();
        }catch (IOException e){
            System.out.println("C");
            return ;
        }finally {
            System.out.println("d");
        }
        System.out.println("f");
    }

    private static void doA(){
        System.out.print("a");
        if(false){
            throw new IndexOutOfBoundsException();
        }
    }
    private static void doB() throws FileNotFoundException{

        System.out.println("b");
        if(true){
            throw new FileNotFoundException();
        }
    }
}
