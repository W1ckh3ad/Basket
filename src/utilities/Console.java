package utilities;
import java.util.Scanner;

public class Console {
    // Output
	// displays string on console 
	public static void printMessage (String string) {
        System.out.print(string);
	}
	
	public static void printlnMessage (String string) {
        System.out.println(string);
	}
	
	public static void printlnErrorMessage (String string) {
		System.out.println("*** Error: " + string + " ***");
	}
	

	// Input
	private static Scanner eingabe = new Scanner(System.in);
	// reads an Integer
	public static int readInt(String prompt){
		printMessage(prompt + ": ");
		
		int a = eingabe.nextInt();
		
		return a;
	}

	// Overload with limits
	public static int readInt(String prompt, int min, int max){
		int result = readInt(prompt);
		while (result < min || result > max) {
			printlnErrorMessage("Input error! Please repeat ...");
			result = readInt(prompt);
		}
		return result;
	}

    public static String readString(String prompt) {
		printMessage(prompt + ": ");
		return System.console().readLine();
    }
	
	// displays prompt, offers set of choice options
    public static String readChoice(String... choiceOptions) {
		int choice;
		for (int i = 0; i < choiceOptions.length; i++) {
			printlnMessage("(" + i + ") " + choiceOptions[i]);
		}
		choice = readInt("Enter your choice", 0, choiceOptions.length - 1);
		return choiceOptions[choice];
	}
    
}