package StreamAPI;

public class Person implements fluentApi{
	
	private String name;
	private String lastName;
	private int age;
	
	public Person( String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void setName( String name) {
		this.name =name;
	}
	
	public String getName () {
		return this.name;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setAge( int age) {
		this.age = age;
		
	}
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.lastName +" " +this.name +" "+ this.age;
		
	}

	public Person addName(String name) {
		this.name = name;
		return this;
	}

	public Person addLastName(String lastName) {
	    this.lastName = lastName;
		return this;
	}

	public Person addAge(int age) {
		this.age = age;
		return this;
	}

}
