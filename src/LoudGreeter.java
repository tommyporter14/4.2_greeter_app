
public class LoudGreeter extends Greeter{
	
	//fields 
	private String extra = "!";
	
	//add volume method
	public void addVolume() {
		extra += "!";
	}
	
	//constructor
	public LoudGreeter(String greeting) {
		super(greeting);
	}
	
	//override greet method
	@Override
	public String greet(String name) {
		return super.greet(name) + extra;
	}

}
