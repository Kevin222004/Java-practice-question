/*
 Write a program to display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks.  
   *
  ***
 *****
 */

package PatternProblem;
import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number of row to print : ");
		int n = sc.nextInt();
		for(int row =1;row<=n;row++) {
	
			for(int space=1;space<n-row+1;space++) {
				System.out.print(" ");
			}
			
			
			for(int col =1 ;col<=2*row-1;col++) {
				System.out.print("*");
			}
			System.out.println();
		
		
	}

}
}