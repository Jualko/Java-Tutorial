// public: class name must match file name
// only 1 public class per file
public class App {

	public static void main(String[] args) {

		Azubi azubi1 = new Azubi();
		azubi1.name = "Justin";
		azubi1.lehrjahr = 2;
		// azubi1.password = "password";
		// wouldn't work, because 'password' is a private variable

		Azubi azubi2 = new Azubi();
		azubi2.setName("Firas");
		azubi2.setLehrjahr(1);
		azubi2.setPassword("eskere");

		System.out.println(azubi1.name + ", " + azubi2.name);

		// method is called with an argument
		azubi1.code("int i = 0;");
		azubi2.code("int pasta = 42;");

		Azubi azubi3 = new Azubi();
		azubi3.setInfo("Dieter", 3, "?!~0@ö");
		
		System.out.println("Name: " + azubi3.getName() + ", Password: " + azubi3.getPassword());
	}
}

//class: template / blueprint for creating objects
class Azubi {

	// 1. Instance variables (data)
	String name;
	int lehrjahr;

	// private variables can not be accessed directly outside of the class
	private String password;

	// 2. Subroutines (method: subroutine of a class)
	// sCode: parameter
	void code(String sCode) {
		System.out.println(sCode);
		System.out.println("This code was presented to you by " + name);
	}

	void setInfo(String name, int lehrjahr, String password) {
		setName(name);
		setLehrjahr(lehrjahr);
		setPassword(password);
	}

	// Getters and Setters
	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String name) {
		// 'this' referrers to the object itself
		this.name = name;
	}

	public int getLehrjahr() {
		return lehrjahr;
	}

	public void setLehrjahr(int lehrjahr) {
		this.lehrjahr = lehrjahr;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}