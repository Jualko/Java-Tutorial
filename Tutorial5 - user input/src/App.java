import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// new Scanner object
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name confirm with [RETURN]:");

		String name = input.nextLine();

		System.out.println("Enter your age:");

		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("You may proceed, " + name);
		} else {
			System.out.println("Try again next year");
		}

		// do ... while
		// the variable used as the condition must be declared outside the loop
		int number = 0;

		do {
			System.out.println("Guess the number");
			number = input.nextInt();
		} while (number != 5);

		System.out.println("Correct");

		// switch
		System.out.println("Please enter your command:");
		String sText = input.nextLine();
		// nextLine() needs to be called twice because nextInt() was used before
		// nextInt() doesn't read the newline character the previous input created
		// the first nextLine() returns that newline character
		sText = input.nextLine();
		switch (sText) {
		case "start":
			System.out.println("Programm started!");
			break;
		case "stop":
			System.out.println("Programm stopped!");
			break;
		default:
			System.out.println("Unknown command");
			break;
		}

	}
}