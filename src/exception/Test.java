package exception;

public class Test {
    class L extends Exception{}
    class M extends L {}
    class N extends RuntimeException{}
    public void p() throws L { throw new M();}
    public void q() throws N {throw new N();}
    public static void main(String[] args){
        try{
            Test t = new Test();
            t.p();
            t.q();
        }catch ( L e){
            System.out.println("exception caught");

        }finally {
            System.out.println("ROber");
        }
        System.out.println("Fin");
    }
}
//Excep <- L <- M
//RuntimeExcept <-N

class ExceptionTest {
    public static void main(String[] args) {
              try {
                        doSomething();
                    } catch (Exception e) {
            System.out.println(e);
                    }
            }

            static void doSomething() throws Exception {
        final  int i =0;
                int[] array = new int[4];
                array[4] = 4;
                doSomethingElse();
            }

            static void doSomethingElse() throws Exception {
                throw new Exception("Sorry, can't do something else");
            }
}