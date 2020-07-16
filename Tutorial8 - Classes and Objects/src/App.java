// public: class name must match file name
// only 1 public class per file
public class App {

	public static void main(String[] args) {

		Azubi azubi1 = new Azubi();
		azubi1.name = "Justin";
		azubi1.lehrjahr = 2;

		Azubi azubi2 = new Azubi();
		azubi2.name = "Firas";
		azubi2.lehrjahr = 1;

		System.out.println(azubi1.name + ", " + azubi2.name);

		azubi1.code("int i = 0;");
		azubi2.code("int pasta = 42;");
	}
}

//class: template / blueprint for creating objects
class Azubi {

	// 1. Instance variables (data)
	String name;
	int lehrjahr;

	// 2. Subroutines (methods)
	void code(String sCode) {
		System.out.println(sCode);
		System.out.println("This code was presented to you by " + name);
	}
}