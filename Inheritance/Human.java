class Human {
	public int age;                // The Human's age (an integer).
	public String name;            // The Human's name.

	public void introduce() {      // This is a _method_definition_.
		System.out.println("I'm " + name + " and I'm " + age + " years old.");
	}
	
	public static void main(String[] args) {
		Human amanda = new Human();    // Create amanda.
	  	amanda.age = 6;                // Set amanda's fields.
	  	amanda.name = "Amanda";
	  	amanda.introduce();            // _Method_call_ has amanda introduce herself
	}
}
