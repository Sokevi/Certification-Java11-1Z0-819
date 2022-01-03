package agoraTemple;

public abstract class Operator {
    protected abstract void turnON();
    protected abstract void turnOFF();
}

class Personne {
    private String name = "Joe Blog";
    public Personne(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}

class Tesster{
    public static void main(String... strings){
       //Personne p1 = new Personne();// bug
       // System.out.println(p1);

        String s ="";
        if(Double.parseDouble("11.00f") >11){
            s +=1;
        }
        if( 1_7 == Integer.valueOf("17")){
            s +=2;
        }
        if(1024 > 1023L){
            s +=3;
        }

        System.out.println(s);

    }
}


class A {
    public int x =42;
    protected A(){

    }
}

class  B extends A {
    int x =17;
    public B(){
        super();
    }

    public static void main(String... strings){
        A obj = new B();
        System.out.println(obj.x);
    }
}

