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

	}
}