package heritage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Foo {

    public void foo(Collection arg){
        System.out.println("Bonjour le mode");
    }


}

 class Bar extends Foo{


    public void foo(Collection collection){
        System.out.println("Hello word");
    }

    public void foo(List list){
        System.out.println("Holla Mundo");
    }

 }


 class Maine{
    public static void main(String... strings){
        List<String > li = new ArrayList<>(1);
       ;
        System.out.println(li);

        Foo f1 = new Foo();
        Foo f2 = new Bar();



        Bar b1 = new Bar();
        f1.foo(li);
        f2.foo(li);

        b1.foo(li);

        checkCOnfiguration("App.config");
        System.out.println("Configuration is OK");
    }


    public static void checkCOnfiguration(String filename){
        File file = new File(filename);
        if(!file.exists()){
            throw new Error("Fatal Error:  Configuration file,"+ filename+" , is missing");
        }
    }
 }

