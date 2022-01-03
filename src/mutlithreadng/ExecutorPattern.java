package mutlithreadng;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPattern {

	
	public static void main(String[]  agrs) {
		
		ExecutorService es = Executors.newFixedThreadPool(4);
		 
		Runnable Runnabletask = () -> {
			int i =0;
			do {
			
			System.out.println("i am  i value ==> "+ i);
			i++;
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}while(i<10);
		
		};
			
		es.execute(Runnabletask);
		
		
		Callable<List<String>> callableTask = ()->{
			
			List<String>  StringList = Arrays.asList( "Papa","Maman","Frere","Soeur");
			
			StringList.forEach(System.out::println);
			
			return StringList;
			
		};
		es.submit(callableTask);
	
		
		es.shutdown();
	}
}
