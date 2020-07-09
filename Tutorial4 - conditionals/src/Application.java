
public class Application {

	public static void main(String[] args) {

		boolean cond = 3 > 8;
		System.out.println(cond); // false

		// if else
		if (cond) {
			System.out.println("It's true");
		} else if (!cond) {
			System.out.println("It's false");
		} else {
			System.out.println("How did you get here?!");
		}

		// while loop
		int loop = 0;
		while (true) {
			System.out.println("Looping " + loop);
			if (loop == 5) {
				break;
			}
			loop++;
		}
	}

}