/*
	Write a program  to make such a pattern like a pyramid with numbers increased by 1.  
   1 
  2 3 
 4 5 6 
7 8 9 10 
*/

package PatternProblem;

public class pattern9 {

	public static void main(String[] args) {
		int k = 1, col = 1;
		for (int row = 1; row <= 4; row++) {

			int space = 4 - row;
			for (int i = space; i >= 1; i--) {

				System.out.print(" ");
			}

			for (col = 1; col <= row; col++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}

	}

}
