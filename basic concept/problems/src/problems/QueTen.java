/* 
 Write a program  to display the n terms of even natural number and their sum.  
Test Data :
Input number of terms : 5
Expected Output :
The even numbers are :2 4 6 8 10
The Sum of even Natural Number upto 5 terms : 30
*/
package problems;

import java.util.Scanner;

public class QueTen {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.print("Input number of terms : " );
	    int number = n.nextInt();
	    int sum =0;	
	    System.out.print("The even numbers are :");
	    for(int i = 1;i<=number ;i++) {
	    	System.out.print(2*i + " ");
	    	
	    	sum = sum + (2*i);
	    
	    }
	    System.out.println();
	    System.out.println("The sum of even Natrual Number upto 5 terms : " + sum);
	}

}
