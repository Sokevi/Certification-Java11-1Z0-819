package heritage;

public class ClasseB extends  ClasseA {
  int i = 1;

    public void doSomething(){
        System.out.println("Classe B do something ");
    }


    public static void main(String[]  agrs){

        ClasseA cA = new ClasseA();

        ClasseA cAB = new ClasseB();
        cAB.i=35;


       // ClasseB classeB =  new ClasseA();
        ClasseB classeB = (ClasseB) cA;

        System.out.println(cAB.i +"" );
        cAB.doSomething();

    }
}
