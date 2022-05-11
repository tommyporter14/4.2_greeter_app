import java.util.ArrayList;
import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		
		//scanner
		Scanner scnr = new Scanner(System.in);
		
		//get info
		System.out.println("USER INPUT COLLECTION");
		System.out.println("Choose a greeting message: ");
		String greeting = scnr.nextLine();
		System.out.println("Enter a name: ");
		String name = scnr.nextLine();
		
		//greet basic
		System.out.println("\nBasic Greeter Print:");
		Greeter greetOne = new Greeter(greeting);
		System.out.println(greetOne.greet(name));
		
		//greet Simon
		System.out.println("\nSimon Greeter Print:");
		SimonGreeter greetTwo = new SimonGreeter(greeting);
		System.out.println(greetTwo.greet(name));
		
		//greet loud
		System.out.println("\nLoud Greeter Print:");
		LoudGreeter greetThree = new LoudGreeter(greeting);
		System.out.println("How much volume to add? (0-10): ");
		int volume = scnr.nextInt();
		for (int i = 0; i < volume; i++) {
			greetThree.addVolume();
		}
		System.out.println(greetThree.greet(name));
		
		//greet html default
		System.out.println("\nHTML Default Print:");
		HtmlGreeter greetFour = new HtmlGreeter(greeting);
		System.out.println(greetFour.greet(name));
		
		//greet html custom
		System.out.println("\nHTLM Custom Greeter Print:");
		System.out.println("What HTLM tag would you like to add?:");
		String tagName = scnr.next();
		HtmlGreeter greetFive = new HtmlGreeter(greeting, tagName);
		System.out.println(greetFive.greet(name));
		
		//array list of greetings
		System.out.println("\nArrayList Print:");
		ArrayList<Greeter> greetingsList = new ArrayList<>();
		greetingsList.add(new Greeter("Hello"));
		greetingsList.add(new SimonGreeter("Hey"));
		greetingsList.add(new LoudGreeter("Hi"));
		greetingsList.add(new HtmlGreeter("Hola","p"));
		for(Greeter greeter : greetingsList) {
			System.out.println(greeter.greet("Tommy"));
		}
		
		//clear scanner
		scnr.nextLine();
		
		//ask user what type of greeting they want
		boolean tF = false;
	while(!tF) {
		System.out.println("\nPick what greeting to use (basic, simon, loud, html):");
		String choice = scnr.nextLine();
		System.out.println("Choose a greeting message: ");
		String greeting2 = scnr.nextLine();
		System.out.println("Enter a name: ");
		String name2 = scnr.nextLine();
		if(choice.equals("basic")) {
			Greeter gr1 = new Greeter(greeting2);
			System.out.println(gr1.greet(name2));
		}
		else if (choice.equals("simon")) {
			SimonGreeter gr2 = new SimonGreeter(greeting2);
			System.out.println(gr2.greet(name2));
		}
		else if (choice.equals("loud")) {
			LoudGreeter gr3 = new LoudGreeter(greeting2);
			System.out.println("How much volume to add? (0-10): ");
			int volume2 = scnr.nextInt();
			for (int i = 0; i < volume2; i++) {
				gr3.addVolume();
			}
			System.out.println(greetThree.greet(name2));
			//clear scanner
			scnr.nextLine();
		}
		else if (choice.equals("html")) {
			System.out.println("What HTLM tag would you like to add?:");
			String tagName2 = scnr.next();
			HtmlGreeter gr4 = new HtmlGreeter(greeting2, tagName2);
			System.out.println(gr4.greet(name2));
			//clear scanner
			scnr.nextLine();
		}
		else {
			System.out.println("Not a valid choice");
		}
		System.out.println("\nWould you like to continue? (y/n)");
		String yN = scnr.nextLine();
		if(yN.equals("y")) {
			tF = false;
		}
		else if (yN.equals("n")) {
			System.out.println("\nGoodbye!");
			tF = true;
		}
		else {
			System.out.println("\nNot a valid choice, goodbye!");
			tF = true;
		}
		
	}	
		//scanner close
		scnr.close();
	}

}
