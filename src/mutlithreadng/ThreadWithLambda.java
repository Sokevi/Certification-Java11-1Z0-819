package mutlithreadng;

import functionalInterface.Supplier;

public class ThreadWithLambda {
	
	/*static void myLamda(){
		int i=25;

		Supplier<Integer> foo = () -> i;
		i++;
		System.out.println(foo.get());
	};*/
	public static void main (String[] agrs){
		//myLamda();
		Runnable r = ()-> System.out.println("Run implement with lambda");
		
		r.run();  // NO creating antoher thread 
		
	}

}
