package apiDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestManageApiDate  {

	
	public static void main(String[] agrs) {
		
	   LocalDate today = LocalDate.now();
	   System.out.println("today -->"+today);
		
	   LocalDate tomorow = today.plusDays(1);
	   System.out.println("Tomorow -->"+ tomorow);
	   
	   Calendar calendar = Calendar.getInstance();
	   if ( calendar.get( Calendar.MONTH )==Calendar.OCTOBER ) { 
	     System.out.println("la date courante est en janvier"); }
	   
	   LocalDate myDate = LocalDate.of(2018, 06, 10);
	   LocalDate mDate2 = LocalDate.parse("2011-02-10");
	   
	   
	   LocalTime time =  LocalTime.now();
	   
	   ZoneId zoneId = ZoneId.of("Europe/Paris");
	   System.out.println(zoneId);
	   
	   Set<String> allZoneIds  = ZoneId.getAvailableZoneIds();
	   
	   allZoneIds.stream()
	   			 .filter(s -> s.equals("Europe/Vatican"))
	   			 .collect(Collectors.toList())
	   			 .forEach(System.out::println);
	   
	   
	   
	   LocalDate firstDate = LocalDate.of(2016,10,15); 
	   
	   LocalDate secondDate = LocalDate.of(2018,11,12);
	   
	   
	  int period=  Period.between(firstDate, secondDate).getMonths();
	   
	   int[] i ;
	   
	   
	
	}
	

	
	
	
}
