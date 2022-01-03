package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import java.time.LocalTime;



public class ManagerPerson {
	
	private List<Person> personList  ;
	
	public ManagerPerson(  ) {
		this.personList = new ArrayList<Person>();	
	}
	
	public List<Person> addListPerson (ArrayList<Person> personList) {
		
		this.personList.addAll(personList);
		
		return this.personList;
	}
	
	public List<Person> getAllPerson () {
		
		return this.personList;
	}
	
	
	public void addPerson ( Person person) {
		this.personList.add(person);
		
	}
	
	public List<Person> findPerson (Person person) {
		
		return personList.stream()
						.filter(p -> p.getName().equals(person.getName())
								&& p.getLastName().equals(person.getLastName())
								&& p.getAge() == person.getAge() )
						.collect(Collectors.toList());
						
						
	}
	
	
	public boolean findAndDeletePerson (Person person) {
		return this.personList.removeAll(findPerson(person));
		
		 
	}
	
	public List<Person>  sortedPerson (){
		return this.personList.stream()
							  
							  .sorted(Comparator.comparing(Person:: toString))
							  .collect(Collectors.toList());
	}


	public static void main(String[] args) {
		
		Person fluentPeron = fluentApi.person()
									  .addAge(10)
									  .addName("aPipi")
									  .addLastName("fulent");
									  
									  
		Person person1 = new Person("Landry", "Gato", 26);
		Person person2 = new Person("Hasintus", "TOrtue", 24);
		Person person3 = new Person("Eric", "Pede", 26);
		Person person4 = new Person("Manolo", "Pigme", 25);
		Person person5 = new Person("Chonin", "NoSchool", 30);
		Person person6 = new Person("Adjoko", "Kaka", 26);
		Person person7 = new Person("Simon", "Tapeur", 46);
		Person person8 = new Person("Romeo", "Benin", 26);
		
		ArrayList<Person> source = new ArrayList<Person>();
		
	   Collections.addAll(source,fluentPeron, person1, person2, person3, person4, person5, person6, person7, person8);
		
	   
	   //source.forEach(System.out::println);
	   
	    ManagerPerson managerPerson = new ManagerPerson();
	
	    managerPerson.addListPerson(source );
	   
	    managerPerson.findAndDeletePerson(person8);
	    
	    managerPerson.getAllPerson().forEach(System.out::println);
	    
	    System.out.println("**************");
	    managerPerson.sortedPerson().forEach(System.out::println);
	    

	    System.out.println("**************");
	    Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
	    nameStream.peek(System.out::println);
	    

	    System.out.println("**************");
	     Stream.of("one", "two", "three", "four")
	    .filter(e -> e.length() > 3)
	    .peek(e -> System.out.println("Filtered value: " + e))
	    .map(String::toUpperCase)
	    .peek(e -> System.out.println("Mapped value: " + e))
	    .collect(Collectors.toList());
	     
	   
	}
	
	
	
	
    
	
	

}
