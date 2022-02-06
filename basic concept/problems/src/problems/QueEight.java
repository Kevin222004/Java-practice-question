/*
   8. Write a program  to display the n terms of odd natural number and their sum .  
Test Data
Input number of terms : 10
Expected Output :
The odd numbers are :1 3 5 7 9 11 13 15 17 19
the Sum of odd Natural Number upto 10 terms : 100 
*/

package problems;

import java.util.Scanner;

public class QueEight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Input number of terms : ");
		int terms = sc.nextInt();		
		
		int sum = 0;
		
		System.out.print("The odd numbers are : ");
		for(int i =1;i<=terms;i++) {
			System.out.print((2*i-1) + " ");
		    sum += (2*i-1) ;
		
		}
		System.out.println();
		   System.out.print("The Sum of odd Natural Number upto " + terms + " : " + sum);
	}

}
