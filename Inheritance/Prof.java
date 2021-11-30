
public class Prof extends Worker {

	public Prof(String givenName) {
		super(givenName);
	}
	
	public void work() {
		teach();
		doResearch();
	}
	
	public void teach() {
		System.out.println("Prof. is teaching...");
	}
	
	public void doResearch() {
		System.out.println("Prof. is doing research...");
	}
	
	
}
