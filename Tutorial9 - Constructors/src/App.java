
public class App {

	public static void main(String[] args) {
		Azubi azubi1 = new Azubi();
		System.out.println(azubi1.getCompany()); // bsc solutions

		Azubi azubi2 = new Azubi("SAP");
		System.out.println(azubi2.getCompany()); // SAP

		BossDude boss1 = new BossDude();
		BossDude boss2 = new BossDude("Miro", 3500);
		System.out.println(boss1.getName()); // Boss
		System.out.println(boss2.getName()); // Miro
	}

}

class Azubi {
	private String company;

	// constructor: run every time you create a new instance of the class
	public Azubi() {
		System.out.println("azubi constructor 1");
		company = "bsc solutions";
	}

	// multiple constructors with different parameters, but the same name
	public Azubi(String company) {
		System.out.println("azubi constructor 2");
		this.setCompany(company);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}

class BossDude {
	private String name;
	private int salary;

	public BossDude() {
		// a constructor can call another constructor of the same class
		this("Boss", 9999);
		System.out.println("boss constructor 1");
	}

	public BossDude(String name) {
		this(name, 9999);
		System.out.println("boss constructor 2");

	}

	public BossDude(String name, int salary) {
		this.setName(name);
		this.setSalary(salary);
		System.out.println("boss constructor 3");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}