
/*
	   Write a program  to make such a pattern like a pyramid with an asterisk.  
	   * 
	  * * 
	 * * * 
	* * * *
	*/
package PatternProblem;

public class Pattern10 {

	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			int space = 4 - row;
			for (int i = space; space >= 1; space--) {
				System.out.print(" ");
			}

			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}