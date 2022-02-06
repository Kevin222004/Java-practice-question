/*
Write program to check whether a given number is an armstrong number or not.  
*/
package problems;

import java.util.Scanner;

public class Que17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number" + " ");
		int n = sc.nextInt();
		int r, sum = 0, temp;
		int i ;
		for ( i = n; n != 0; n = n / 10) {
			r = n % 10;
			sum = sum + (r * r * r);
		}
		if (sum == i) {
			System.out.println("The number is Armstrong");
		} else {
			System.out.println("The number is not a Armstrong number ");
		}
	}

}
