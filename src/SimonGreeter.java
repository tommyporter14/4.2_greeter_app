
public class SimonGreeter extends Greeter {
	
	//constructor
	public SimonGreeter (String greeting) {
		super(greeting);
	}
	
	
	//override greet method
	@Override
	public String greet(String name) {
		return "Simon says, \"" + super.greet(name) + "\"";
	}

}
