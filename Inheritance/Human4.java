
public class Human4 {
	public static int numberOfHumans;
	
	public int age;                // The Human's age (an integer).
	public String name;            // The Human's name.


	
	public Human4(String givenName) {
		numberOfHumans++;    // The constructor increments the number by one.

		age = 0;
		name = givenName;
	}
	public Human4() {
		numberOfHumans++;    // The constructor increments the number by one.
		
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

	public static void printHumans() {
		System.out.println("There are " + numberOfHumans + "people in total.");
	}

	
	public static void main(String[] args) {
		Human4 amanda = new Human4();    // Create amanda.
	  	//amanda.age = 6;                // Set amanda's fields.
	  	//amanda.name = "Amanda";
	  	amanda.introduce();            // _Method_call_ has amanda introduce herself
	
	  	amanda.change(11);
	  	amanda.introduce();
	  	
	  	Human4 bob = new Human4();    
	  	Human4 carol = new Human4();    
	  	Human4 david = new Human4();    
	  	Human4 ed = new Human4();    
	  	
/*	  	int total = Human4.numberOfHumans;
	  	System.out.println("There are " + total + " people in total now.");*/
	  	
	  	Human4.printHumans();
	}
}
