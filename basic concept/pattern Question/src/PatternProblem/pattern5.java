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

public class pattern5 {

	public static void main(String[] args) {
	
		anyNumber(4);
		
		//--->> Second type(for int = 5 only
 		
//		for(int row=1;row<=9;row++) {
//			if(row>=1 && row<=5) {
//				for(int col=1;col<=row;col++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			else {
//				for(int col=1;col<=9-row+1;col++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
//		
		
		
	}
	
	static void anyNumber(int n) {
		for(int row=0;row<2*n;row++) {
			int totalColsInRow = row > n ? 2 * n - row : row;
			for(int col = 0;col< totalColsInRow;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
}
