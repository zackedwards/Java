
public class TestInheritance {

	public static void main(String[] args) {
		Prof yang = new Prof("Yang");    // Create yang.
	  	yang.work();            // _Method_call_ has yang introduce herself
	
	  	TA denisse = new TA("denisse");
	  	denisse.work();
	  	
	  	Worker wYang = yang;
	  	Worker wDenisse = denisse;
	  	
	  	wYang.work();
	  	wDenisse.work();
	  	
	  	System.out.println(yang.toString());
	  	System.out.println(yang.equals(denisse));
	  	
	  	
	  	
	  	//wDenisse.doLab();
	}
}
