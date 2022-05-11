
public class HtmlGreeter extends Greeter{
	
	//fields
	private String tagName;
	
	//constructors
	public HtmlGreeter(String greeting) {
		super(greeting);
		tagName = "h1";
	}
	
	public HtmlGreeter(String greeting, String tagName) {
		super(greeting);
		this.tagName = tagName;
	}
	
	//override greet method
	@Override
	public String greet(String name) {
		return "<" + tagName + ">" + super.greet(name) + "</" + tagName + ">";
	}

}
