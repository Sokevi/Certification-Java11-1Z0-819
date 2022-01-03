package agoraTemple;

import java.util.HashMap;

public class AllinOne {
	
	
	public static void main(String[] agrs) {
		
		HashMap<Character, String> myMap = new HashMap<Character, String>();
		
		myMap.put('R', "ROME");
		myMap.put('L', "LAURA");
		myMap.put('C', "CARA");
		myMap.put('3', "ROME");
		
		myMap.forEach((K, V) -> System.out.println(K +"  --  "+V));
			
	
		
		
		
		/*StringBuilder strBuild = new StringBuilder();
		
		strBuild.append("Builder");
		
		System.out.println(strBuild);

	    StringBuffer strBuffer = new StringBuffer();
	    strBuffer.append("buffer");
	    System.out.println( strBuffer);*/
	}
	

}
