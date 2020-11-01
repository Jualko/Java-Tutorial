public class App {

	public static void main(String[] args) {
		Azubi.showInfoStatic();

		Azubi.description = "Ich bin ein Azubi";

		Azubi azubi1 = new Azubi();
		azubi1.name = "Bob";

		Azubi azubi2 = new Azubi();
		azubi2.name = "Peter";
		
		Azubi.showInfoStatic();
		azubi1.showInfoInstance();
		azubi2.showInfoInstance();
	}
}

class Azubi {

	// class variables and methods are associated with the class
	// static keyword
	public static String description;
	public static int counter = 0;
	// final (= constant) can't be reassigned
	public static final int LUCKY_NUMBER = 7;

	// Instance variables and methods are associated with the instance
	public String name;
	public int id;

	// constructor
	public Azubi() {
		id = counter;
		counter++;
	}

	// static methods can access static data, but not instance data
	public static void showInfoStatic() {
		System.out.println("description: " + description);
		System.out.println("counter: " + counter);
		System.out.println("LUCKY_NUMBER: " + LUCKY_NUMBER);
		// System.out.println(name);
		// System.out.println(id);
	}

	// instance methods can access static data and instance data
	public void showInfoInstance() {
		System.out.println("description: " + description);
		System.out.println("counter: " + counter);
		System.out.println("LUCKY_NUMBER: " + LUCKY_NUMBER);
		System.out.println("name: " + name);
		System.out.println("id: " + id);
	}
}