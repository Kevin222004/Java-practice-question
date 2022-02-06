/*
Write a program to check whether a given number is a perfect number or not.  
*/
package problems;

import java.util.Scanner;

public class Que16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input the number : ");
		int n = sc.nextInt();

		boolean b = perfect(n);
		if (b == true) {
			System.out.println("The number is perfect");
		} else {
			System.out.println("It is not a perfect number");
		}

	}

	static boolean perfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++)
			if (n % i == 0) {
				sum += i;
				if (sum == n) {
					return true;
				}
			}
		return false;

	}
}