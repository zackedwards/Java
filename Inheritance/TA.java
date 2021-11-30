
public class TA extends Worker {

	public TA(String givenName) {
		super(givenName);
	}
	
	public void work() {
		doLab();
		discussion();
		officeHr();
	}
	
	public void doLab() {
		System.out.println("TA is doing Lab...");
	}
	
	public void discussion() {
		System.out.println("TA is discussing assignments...");
	}
	
	public void officeHr() {
		System.out.println("TA is holding office hour...");
	}
	
}
