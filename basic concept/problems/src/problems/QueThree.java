/*
 3. Write a program  to display n terms of natural number and their sum. 
Test Data : 7
Expected Output :
The first 7 natural number is :
1 2 3 4 5 6 7
The Sum of Natural Number upto 7 terms : 28
 */

package problems;

import java.util.Scanner;

public class QueThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		 System.out.println("Enter the number");
		 int num = sc.nextInt(); 
	
		 System.out.println("The first " + num + " natrual number is : ");
		 for(int i=1;i<=num;i++) {
			 System.out.print(i + " ");
			 sum = sum + i;
		 }
		 System.out.println();
		 System.out.println("The sum of Natrual Number upto " + num + " terms : " + sum);
	
	
	
	}

}
