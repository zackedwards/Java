
public class Person {
	
	public int age;                // The Human's age (an integer).
	public String name;            // The Human's name.

	public Person(String givenName) {
		age = 0;
		name = givenName;
	}
	
	public Person() {
		this.age = 0;
	    this.name = "Untitled";
	}
	
	public void introduce() {      // This is a _method_definition_.
		System.out.println("I'm " + name + " and I'm " + age + " years old.");
	}
	
}
