package heritage;

public class ConSuper {
 boolean f;
   static void tiu(){
   }

   void ff(){

   }
    protected ConSuper(){
        this(2);
        System.out.println("1");
    }
    protected ConSuper(int a){
        System.out.println(a);
    }
}
class ConSub extends ConSuper{
    double v;
    void getV() {
        throw  new IndexOutOfBoundsException();

    }
    ConSub(){
        this(4);
        System.out.println("3");
    }
    ConSub(int a){
        System.out.println(a);
    }
    boolean df;
    public static void main (String[] strings){
       System.out.println(new ConSub(4).df);

      

        double l =.5;
        System.out.println(l);


    }

    @Override
    public String toString() {
        return "ConSub{}";
    }
}
