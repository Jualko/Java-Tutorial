
public class App {

	public static void main(String[] args) {

		// Multi-Dimensional Array: Array of Array
		int[][] grid = {
				{ 11, 12, 13 },
				{ 21, 22, 23 },
				{ 31, 32, 33 }
				};

		System.out.println(grid[1][2]);
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				// \t - tab character
				System.out.print(grid[i][j] + "\t");
			}
			// new line after each row
			System.out.println();
		}

		// Array of an Array of Strings
		// (technically a 2D Array of references to Strings)
		String[][] texts = new String[2][3];

		System.out.println(texts[0][2]);
	}

}
