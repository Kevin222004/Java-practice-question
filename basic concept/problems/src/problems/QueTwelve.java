/*
   Write a program to display the sum of the series [ 9 + 99 + 999 +  9999 ...].  
Test Data :
Input the number or terms :5
Expected Output :
9 99 999 9999 99999
The sum of the series = 111105
*/
package problems;

import java.util.Scanner;

public class QueTwelve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = 9;
		int sum = 0;
		System.out.print("Input the number or terms :");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			
			System.out.print(t + " ");
			t=t*10+9;
			  sum +=t;

		}		
		System.out.println();
		System.out.println("The sum of the series = " + sum);
	}

}
