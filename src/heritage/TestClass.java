package heritage;


import java.util.Locale;
import java.util.function.Consumer;

class Plant{

}
class Tulip extends Plant{

}

public class TestClass {
    private static Plant plant;
    public static void main(String... strings){
        plant = new Tulip();
        feed(plant);
        feed(plant);

    }
    public static void feed(Plant p){

        if( p instanceof  Tulip){
            System.out.println("Take extra care");
        }
        p = null;
    }
}
