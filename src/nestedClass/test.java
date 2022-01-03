package nestedClass;

import java.util.Arrays;

public class test {
	
	 protected void finalize() {
		    System.out.print("je vais dispara�tre !");
		  }

		  public static void main(String[] args) {
			  
			String [] num = new String[] {"1","9","10"};
			
			Arrays.sort(num);

			System.out.println(Arrays.toString(num));
			  
			  test objetCurieux = new test();
		    objetCurieux = null;
		  
		    
		    System.gc();

		    for(int i = 0; i < 1000 ; ++i) {
		      System.out.print('.');
		    }

}
}
