/*
  Write a program to print the Floyd's Triangle.  
1 
01
101 
0101 
10101
 */
package PatternProblem;

public class pattern13 {

	public static void main(String[] args) {

		int row, col;

		for (row = 1; row <= 5; row++) {
			for (col = 1; col <= row; col++) {
				if ((row + col) % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}

			}
			System.out.println();
		}
	}

}
