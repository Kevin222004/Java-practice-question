/*
4. Write a program to read 10 numbers from keyboard and find their sum and average.  
Test Data :
Input the 10 numbers :
Number-1 :2
...
Number-10 :2
Expected Output :
The sum of 10 no is : 55
The Average is : 5.5
 */

package problems;

import java.util.Scanner;

public class QueFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] marks = new int[10];

		int sum = 0;
		double avg;
		System.out.println("Input the 10 numbers : ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Number - " + (i + 1) + " : ");
			marks[i] = sc.nextInt();
			
			sum =sum + marks[i];
		}

				avg = (double) (sum / 10.0);
		System.out.println("The sum of 10 no is : " + sum);
		System.out.println("The Average is : " + avg);

	}

}

