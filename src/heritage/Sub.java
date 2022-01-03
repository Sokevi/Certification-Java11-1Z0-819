package heritage;

class Super {
    static String greeting(){ return "Good Night";}
    String name(){ return "Harry";}
}

public class Sub extends Super {
    static String greeting(){ return "Good Morning";}
    String name(){ return "Potter";}

    public static void main(String... strings){
        Super se = new Sub();
        System.out.println(se.greeting()+", "+se.name());
        String[] agrs = {"one" ,"two", "three"};
        int i =1;
        for(String s: agrs){
            System.out.println((i++) + ")" +s);
        }

    }
}

