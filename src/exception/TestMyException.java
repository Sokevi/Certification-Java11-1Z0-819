package exception;


import java.io.BufferedReader;
import java.lang.System;
public class TestMyException {

	
	public static void controle(String s) throws MyPersonnalException {
		
		if(s.toLowerCase().equals("Pomel")) {
			throw new  MyPersonnalException("Landry's Exception is throw !");
		}
	}
	
	public static int  main(String[] args) {
		
		String firstString ="Pomel";
		
		String secondString = "Landry";

		
		try {
			controle(firstString);

		} catch (MyPersonnalException e) {
			
		e.printStackTrace();

			// TODO: handle exception
		}
		System.out.println("yyyyyy");

		try {
			controle(secondString);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}finally {
			System.out.println("yyyyyy");

		}
		return 1;

	}

}
