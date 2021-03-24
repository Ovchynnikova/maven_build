package week1.day1;

public class TC001LaunchBrowser {
	
	// won't execute anything, because this is not the main method
	// also these functions are not static
	public void sample1( ) {
		System.out.println("Hello World 1");
		
	}
	public void sample2( ) {
		System.out.println("Hello World 2");
		
	}
	public void sample3( ) {
		System.out.println("Hello World 3");
		
	}
	
	// to execute smth, this smth needs to placed in the main method
	// and this functions is static
	public static void main(String[] args) {
		
	// Create Object of the Class to be able to execute the non-static 
	// functions within the static one 
	// syntax: ClassName obj = new ClassName();
	TC001LaunchBrowser obj = new TC001LaunchBrowser();
	// now we have an object
	//sample1();
	//sample2();
	//sample3();
	obj.sample1();
	obj.sample2();
	obj.sample3(); 
}
	
	
}
