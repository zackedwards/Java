
public class Human3 {
	public int age;                // The Human's age (an integer).
	public String name;            // The Human's name.

	public Human3(String givenName) {
		age = 0;
		name = givenName;
	}
	public Human3() {
	    this.age = 0;
	    this.name = "Untitled";
	}
	
	public void introduce() {      // This is a _method_definition_.
		System.out.println("I'm " + name + " and I'm " + age + " years old.");
	}
	
	public void change(int age) {
	    String name = "Tom";
	    this.age = age;
	    this.name = name;
	  }

	
	public static void main(String[] args) {
		Human3 amanda = new Human3();    // Create amanda.
	  	//amanda.age = 6;                // Set amanda's fields.
	  	//amanda.name = "Amanda";
	  	amanda.introduce();            // _Method_call_ has amanda introduce herself
	
	  	amanda.change(11);
	  	amanda.introduce();
	}
}
