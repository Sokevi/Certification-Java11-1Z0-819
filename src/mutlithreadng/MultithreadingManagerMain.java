package mutlithreadng;

import java.util.concurrent.atomic.AtomicBoolean;

public class MultithreadingManagerMain {
	
	public volatile String name;
	
	public AtomicBoolean isLive;
	
	
	public static void main(String[] args) {
		
		System.out.println("-->Start: "+ Thread.currentThread());
		
		ThreadwithClass threadwithClass = new ThreadwithClass();
		
		threadwithClass.setDaemon(false);// True mean this thread stop when the main thread is finish ==> Deamon
		threadwithClass.start(); // create a new thread and start it
		
		threadwithClass.interrupt();
		
		System.out.println("-->stop: "+ Thread.currentThread());
		
		
		
		
	}

}
