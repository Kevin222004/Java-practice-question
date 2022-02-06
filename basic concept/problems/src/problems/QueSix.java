/*
 6. Write a program to display the multiplication table of a given integer.  
Test Data :
Input the number (Table to be calculated) : 15
Expected Output :
15 X 1 = 15
...
...
15 X 10 = 150
 */


package problems;

import java.util.Scanner;

public class QueSix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the number (Table to be calculate) : ");
		int num = sc.nextInt();
		
		int multiplication;
		
		for(int i=1;i<=10;i++) {
	      multiplication = num * i;
	      System.out.println(num + "X" + i + " = " + multiplication);
		}
	}

}
