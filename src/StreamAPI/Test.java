package StreamAPI;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet s = new HashSet<>();
		
		s.add(new Integer(1));
		s.add(new Integer(1));
		s.add(new Integer(2));
		s.add(new Object());



		s.parallelStream().forEach(System.out::println);
		/*
		Consumer<Integer> print = (Integer x) -> { System.out.println(x); };
		String[] strings = { "f", "o", "o", "bar" };
		
		   String result ="";
			for(int i=0; i  < strings.length; i++){
	          result = result.concat(strings[i]);
	        }
	       System.out.println(result);
	       
	       int o =5;
	       System.out.println(--o);
	     */
	}

}
