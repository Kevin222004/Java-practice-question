
package PatternProblem;

public class Pattern11 {

	public static void main(String[] args) {
		// If we take input so row <= input;then some changes also applied to
		// logic of space also space = n -row

		for (int row = 1; row <= 4; row++) {
			int space = 4 - row;
			for (int i = space; space >= 1; space--) {
				System.out.print(" ");
			}

			for (int col = 1; col <= row; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}
}
