package functionalInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.UnaryOperator;

public class TestFunctionalInterface implements AbleFly {

	public static void main(String[] args) {


		Integer[] ints ={1,2,3,4,5,6,7};
		var list = Arrays.asList(ints);
		UnaryOperator<Integer> uo =x ->x*3;
		UnaryOperator<Integer> uoo =  ( var x) ->  (3*x);
		list.replaceAll(uo);

		int result =0;
		Abacus aba =(a,b ) -> (a*b);
		result = aba.calc(10,20);
		System.out.println(result);


/*
	Predicate<String> p = t -> t.toString().isEmpty();
	System.out.println(p.Test(""));
	
	String sSupplier = "Robert";
	Supplier<String > s = () -> sSupplier ;
	System.out.println(s.get());
	

    Function<String, Integer> functionImpl = t -> t.length();
    
    System.out.println( functionImpl.apply("fofo gne".trim().repeat(2)));
	 
    var i ="ll";
    
    System.out.println(i);
	*/
	
	}

}
