package mutlithreadng;

public class Ressource {
    public Worker owner;
    public synchronized boolean claim(Worker worker){
      System.out.println("claim");
        if(owner == null){
            owner = worker;
            return true;
        }
        else return false;
    }
    public synchronized void release(){
        System.out.println("release");
        owner = null;
    }
}

class Worker {
    public synchronized void work (Ressource... ressources){
        System.out.println("work");
        for (int i= 0; i <10; i++){
            while (!ressources[0].claim(this)){
                System.out.println("claim1");
            }
            while (!ressources[1].claim(this)){
                System.out.println("claim2");
            }
            ressources[1].release();
            ressources[0].release();
        }
    }

    public static void main(String... strings){
        Worker w1 = new Worker();
        Worker w2 = new Worker();

        Ressource r1 = new Ressource();
        Ressource r2 = new Ressource();

        new Thread(() ->{
            w1.work(r1,r2);
        }).start();

        new Thread(() -> {
            w2.work(r2,r1);
        }).start();
    }
}
