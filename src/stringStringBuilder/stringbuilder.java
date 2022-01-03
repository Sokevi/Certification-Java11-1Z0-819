package stringStringBuilder;

import heritage.X;

import java.io.Serializable;

public class stringbuilder implements Serializable
{

    public static void main(String... strings){

        StringBuilder sb = new StringBuilder(5);
        sb.append("HOWDY");
        sb.insert(0,' ');
        sb.replace(3,5,"LL");
        sb.insert(6,"COW");
        sb.delete(2,7);
        System.out.println(sb.length());


    }
}

class  Super {
    static String greeting(){
        return "Good Night";
    }
    String name(){
        return "Harry";

    }
}

class Sub extends Super {
    static String greeting(){
        return "Good Morning ";

    }
    String name(){
        return "Potter";
    }
}

class Test{
    public static void main(String... strings){
        Super s = new Sub();
        System.out.println(s.greeting() +"--"+ s.name());
    }
}