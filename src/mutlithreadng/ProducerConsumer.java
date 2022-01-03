package mutlithreadng;


import java.util.ArrayList;

public class ProducerConsumer {

	public static void main(String[] args) {
		
		

	}
	
	public class Caisse {
		
		private java.util.List<String>  buffer = new ArrayList<String>();
		
		private int maxZise = 5;
		
		private Object lock = new Object();
		
		public void producer(String element) throws InterruptedException{
			synchronized (lock) {
				 while(isFull()){
						lock.wait();
				 }

				buffer.add(element);
				lock.notify();
			}
		}
		
		public void consumer(String element) throws InterruptedException  {
			
			synchronized (lock) {
			    while( buffer.isEmpty()) {
					lock.wait();
				}
			    
				buffer.remove(element);
				lock.notify();
				
			}
				      	
		}
		
		public Boolean isFull () {
			
			if (buffer.size()==5)
				return true;
			else 
				return  false;
		}
		
		public Boolean isEmpty() {
			if(buffer.size()==0)
				return true;
			else
				return false;
		}
		
	}

}
