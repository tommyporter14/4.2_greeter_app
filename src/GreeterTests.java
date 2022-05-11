import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class GreeterTests {

	@Test
	void testGreeter1() {
		Greeter gr = new Greeter("hi");
		String expected = "hi, matt!";
		String actual = gr.greet("matt");
		assertEquals(expected, actual);
	}

	@Test
	void testGreeter2() {
		Greeter gr = new Greeter("hello");
		String expected = "hello, james!";
		String actual = gr.greet("james");
		assertEquals(expected, actual);
	}
	
	@Test
	void testSimon1() {
		SimonGreeter gr = new SimonGreeter("hey");
		String expected = "Simon says, \"hey, pat!\"";;
		String actual = gr.greet("pat");
		assertEquals(expected, actual);
	}
	
	@Test
	void testSimon2() {
		SimonGreeter gr = new SimonGreeter("hola");
		String expected = "Simon says, \"hola, gene!\"";;
		String actual = gr.greet("gene");
		assertEquals(expected, actual);
	}
	
	@Test
	void testLoud1() {
		LoudGreeter gr = new LoudGreeter("welcome");
		String expected = "welcome, mary!!";;
		String actual = gr.greet("mary");
		assertEquals(expected, actual);
	}
	
	@Test
	void testLoud2() {
		LoudGreeter gr = new LoudGreeter("what's up");
		gr.addVolume();
		String expected = "what's up, steve!!!";;
		String actual = gr.greet("steve");
		assertEquals(expected, actual);
	}
	
	@Test
	void testLoud3() {
		LoudGreeter gr = new LoudGreeter("howdy");
		gr.addVolume();
		gr.addVolume();
		gr.addVolume();
		String expected = "howdy, cindy!!!!!";;
		String actual = gr.greet("cindy");
		assertEquals(expected, actual);
	}
	
	@Test
	void testHtlmGreeter1() {
		HtmlGreeter gr = new HtmlGreeter("good morning");
		String expected = "<h1>good morning, linda!</h1>";;
		String actual = gr.greet("linda");
		assertEquals(expected, actual);
	}
	
	@Test
	void testHtlmGreeter2() {
		HtmlGreeter gr = new HtmlGreeter("good afternoon", "p");
		String expected = "<p>good afternoon, jim!</p>";;
		String actual = gr.greet("jim");
		assertEquals(expected, actual);
	}
	
	@Test
	void testHtlmGreeter3() {
		HtmlGreeter gr = new HtmlGreeter("greetings", "hr");
		String expected = "<hr>greetings, earthlings!</hr>";;
		String actual = gr.greet("earthlings");
		assertEquals(expected, actual);
	}
}
