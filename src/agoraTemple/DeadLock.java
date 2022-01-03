package agoraTemple;
git

import java.io.Serializable;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock implements Serializable {

	 static Object o = new Object();
	 
	 static Object o1 = new Object();
	 static   int i =0;

	static{
  		i++;
		System.out.println("Hi i am here !!");
	}
	public  synchronized static void m1() {
		
		
			synchronized (o) {// thread 1
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("0 before");
				m2();
				System.out.println("0 after");
				
			}
		
		
	}
	public static  void m2() {
		
		
			synchronized (o1) {//thread 1
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("01 before");
				m1();
				System.out.println("01 after");
			}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ffffii "+i);



		Runnable run1 = ()-> {
			m1();
			System.out.println("run1");};
			
		Runnable run2 = ()-> { 
			m2();
			System.out.println("run2");};
		
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		
		t1.start();
		t2.start();

		StringBuilder sb = new StringBuilder();


		
	}

}
class SomeThrowable extends Throwable { }
class MyThrowable extends SomeThrowable { }