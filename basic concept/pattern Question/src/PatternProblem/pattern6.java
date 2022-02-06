 /*

    *
   **
  ***
 ****
*****

*/

package PatternProblem;

public class pattern6 {

	public static void main(String[] args) {
 
		patternSix(5);

	}

	static void patternSix(int n) {
		for(int row=1;row<=n;row++) {
		  for(int s=1;s<=n-row;s++) {
			  System.out.print(" ");
		  }
				for(int col=1;col<=row;col++) {
					System.out.print("*");
				}
			System.out.println();
			}			
	}
}