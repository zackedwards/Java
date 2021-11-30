class Human2 {
	public int age;                // The Human's age (an integer).
	public String name;            // The Human's name.

	public Human2(String givenName) {
		age = 0;
		name = givenName;
	}
	
	public void introduce() {      // This is a _method_definition_.
		System.out.println("I'm " + name + " and I'm " + age + " years old.");
	}
	
	public static void main(String[] args) {
		Human2 amanda = new Human2("Amanda");    // Create amanda.
	  	//amanda.age = 6;                // Set amanda's fields.
	  	//amanda.name = "Amanda";
	  	amanda.introduce();            // _Method_call_ has amanda introduce herself
	}
}
