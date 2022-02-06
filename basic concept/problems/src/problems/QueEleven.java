/*
 Write a program  to display the n terms of harmonic series and their sum.  
1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
Test Data :
Input the number of terms : 5
Expected Output :
1/1 + 1/2 + 1/3 + 1/4 + 1/5 +
Sum of Series upto 5 terms : 2.283335
*/
package problems;
import java.util.Scanner;
public class QueEleven {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float sum = 0;
		
		System.out.print("Input the number of terms : ");
		int terms = sc.nextInt();
		for(int i=1;i<=terms;i++) {
			System.out.print("1/"+i + " ");
			
			sum += 1/(float)i;
		}
		System.out.println();
		System.out.println("SUm of series upto 5 terms : " + sum );
	}

}
