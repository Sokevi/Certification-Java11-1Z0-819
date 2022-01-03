package secure;

public class Main {
    public static void greet(String... strings){
        System.out.println("Hello");
        for(String arg : strings){
            System.out.println(arg);
        }
    }

    public static void main(String[] agrs){
        Main c = null;
        c.greet();
    }
}
