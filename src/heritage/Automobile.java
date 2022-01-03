package heritage;

public abstract class Automobile {
    abstract void wheels();
}

class Car extends Automobile{


    void wheels(){
        System.out.print(4);
    }

    public static void main(String... strings){
        Automobile automobile = new Car();
        automobile.wheels();
        int i =0;
        int j =i;
        j=4;
        System.out.println("-------> "+i);
    }
}

interface Ex{
    public abstract void methodB();
    public String methodeD();
  private String meth(){
   return "ff";
  }

  default void methode(){

  }

}
