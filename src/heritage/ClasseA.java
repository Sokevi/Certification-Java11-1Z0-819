package heritage;

import java.util.Arrays;

public class ClasseA {
      int i=0;
    public  void doSomething(){
        System.out.println("Classe A do domething");
    }
}

abstract class A{
     protected A(){

    }

}

class B extends A{

    private boolean checkValue(int val){
        return true;
    }

    public int modifyVal(int val){
        if(checkValue(val)){
            return val;
        } else{
            return 0;
        }
    }
    public static void main(String... strings){
      //A a = new A();
       B b = new B();

       System.out.println(b.modifyVal(10));

        /*int[] secA = {2,4,6,8,10};
        int[] secB = {2,4,8,6,10};

        int res1 = Arrays.mismatch(secA,secB);
        int res2 = Arrays.compare(secA, secB);

        System.out.println(res1+ " : "+ res2);*/
    }
}