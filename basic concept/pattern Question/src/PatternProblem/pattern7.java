 /*

  	*
   **
  ***
 ****
*****

*/

package PatternProblem;

public class pattern7 {

	public static void main(String[] args) {
				patternSeven(5);
		
	}
	
	static void patternSeven(int n) {
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
