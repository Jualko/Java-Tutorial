
public class App {

	public static void main(String[] args) {

		// enough memory to hold an int
		int value = 123;

		// 'values' is a reference - no memory is allocated yet
		int[] values;

		// 'values' points to memory being able to hold 3 integers
		// all values in an arrays have a default value (int: 0)
		values = new int[3];

		// specifying a value
		values[1] = 5;

		for (int i = 0; i < values.length; i++) {
			int j = values[i];
			System.out.println(j);
		}
		
		System.out.println("---");
		
		// initialize and declare an array at the same time
		int[] numbers = { 5, 6, 7 };

		for (int i = 0; i < numbers.length; i++) {
			int j = numbers[i];
			System.out.println(j);
		}

		System.out.println("---");

		// array of strings
		// default values for Strings: null
		String[] words = new String[2];

		// this actually allocates the memory for a String
		words[0] = "Hello";
		words[1] = "World";

		for (String word : words) {
			System.out.println(word);
		}
	}
}