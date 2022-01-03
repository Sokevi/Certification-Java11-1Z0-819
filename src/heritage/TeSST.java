package heritage;

public class TeSST {
    public static void main(String... strings){
        AnotherClass ac = new AnotherClass();
        SomeClass sc = new SomeClass();
       // ac =sc;
        sc =   ac;
        sc.methodA();
        sc.methodA();

    }
}

class SomeClass {
    public void methodA(){
        System.out.println("SomeClass#methodeA");

    }
}
class AnotherClass extends SomeClass{
    public void methodA(){
        System.out.println("AnotherCLass#MethodA");
    }
}
