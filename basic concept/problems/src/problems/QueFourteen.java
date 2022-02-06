/*
Write a program  to find the sum of the series [ x - x^3 + x^5 + ......].  
Test Data :
Input the value of x :2
Input number of terms : 5
Expected Output :
The values of the series:
2
-8
32
-128
512
The sum = 410
*/
package problems;

import java.util.Scanner;
import java.lang.Math;
public class QueFourteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input the value of x :");
		int x = sc.nextInt();

		System.out.print("Input the number of terms :");
		int n = sc.nextInt();		
		
		int terms,m=-1,sum=0;
	for (int i = 1;i<=2*n;i++) {
		if(i%2 != 0 ) {
		m = m * (-1);
	   terms = (int) Math.pow(x, i)*m;
	   sum = sum + terms;
	   System.out.println(terms);
		}
	}
	System.out.println("The sum = " + sum);
	
	
	
	}

}
