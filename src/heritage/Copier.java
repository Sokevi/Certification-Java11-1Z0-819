package heritage;

public interface Copier {
    public abstract void getnmae();
    public default void print(String msg){
        System.out.println("Message from copier: "+ msg);
    }
}

abstract class AbstractCopier{
    protected void print (String load){
        System.out.println("Message from Abstract Copier: "+ load);
    }
}
/*
class TestImpl extends AbstractCopier implements Copier{


}*/