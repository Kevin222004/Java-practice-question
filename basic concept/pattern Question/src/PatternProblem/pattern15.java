// print the pascal triangle 
package PatternProblem;
import java.util.*;
public class pattern15 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		int n,num;
		System.out.println("Input the number ");
		n = sc.nextInt();
		for (int row = 0; row < n; row++) {
			for (int space = 0; space < (n - row); space++) {
				System.out.print(" ");
			}
			num = 1;
			for (int col = 0; col <= row; col++) {

				System.out.print(num + " ");
				num = num * (row - col) / (col + 1);
			}
			System.out.println( );
		}
	}
}
