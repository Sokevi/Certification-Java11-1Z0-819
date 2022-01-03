package StreamAPI;

public interface fluentApi {
	
	public Person addName(String name);
	public Person addLastName( String lastName);
	public Person addAge (int age );
	
	public static Person person() {
		
		return new Person();
		
	}

}
