/*
   
 
 *
  **
   ***
    ****
     *****
    ****
   ***
  **
 *


 */

package PatternProblem;

public class pattern8 {

	public static void main(String[] args) {

		patternEight(5);

	}

	static void patternEight(int n) {
		for (int row = 1; row <= 2 * n - 1; row++) {
			int c = row > n ? 2 * n - row : row;
			for (int s = 1; s <= c; s++) {

				System.out.print(" ");
			}

			for (int col = 1; col <= c; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
