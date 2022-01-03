package heritage;

import functionalInterface.Supplier;

public class GreetTest {
    private String name;
    private static class GReet{
        private void print(){
            System.out.println("HEllo word");
        }

    }

    public static void main(String[] strings){
        GreetTest.GReet gReet = new GReet();
        gReet.print();

       GreetTest greetTest = new GreetTest();



       Supplier<GreetTest> supplier = () ->
       {
           greetTest.name ="kkd";
           return greetTest;
       };




        greetTest.name ="lla";

        System.out.println(supplier.get().name);

    }
}

