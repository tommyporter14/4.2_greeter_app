
public class Greeter {

	//fields
	private String greeting;
	
	//getter
	public String getGreeting() {
		return greeting;
	}

	//setter
	public void setGreeting(String greet) {
		this.greeting = greeting;
	}
	
	//constructor
	public Greeter() {
		
	}
	
	public Greeter(String greeting) {
		this.greeting = greeting;
	}
	
	//greet method
	public String greet(String name) {
		return greeting + ", " + name + "!";
	}
}
