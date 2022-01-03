package mutlithreadng;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadwithClass extends Thread {
	
	
    @Override
	public void run(){
		
	   int index = 1;

       for (int i = 0; i < 10; i++) {
           System.out.println("  - Thread with class running - " + index++);
           
          
           
           try {
               // Sleep 1030 miliseconds.
               Thread.sleep(1030);
           } catch (InterruptedException e) {
           }

       }
       System.out.println("  - ==> Thread stopped");
  
	
	}

}
