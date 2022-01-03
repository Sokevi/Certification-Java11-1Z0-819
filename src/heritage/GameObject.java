package heritage;

public class GameObject {
    public Object[] move(int x, int y){
        System.out.println("Move GameObject");
        return new Integer[] { x+ 10, y+10};
    }
}

class Avatar extends GameObject{

    public Object[] move(Number x, Number y){
        System.out.println("Move Character ");
        return super.move(x.intValue(), y.intValue());
    }
    public static void main(String... strings){
        var character = new Avatar();
        character.move(10.0,10.0);
        character.move(10,10);

        System.out.println();
        System.out.println("---------------");

        ////
        String s = "hat at store";
        int x =s.indexOf("at");//4
        s.substring(x+3);//7

        x =s.indexOf("at");
        System.out.println(s + ""+x);
    }
}