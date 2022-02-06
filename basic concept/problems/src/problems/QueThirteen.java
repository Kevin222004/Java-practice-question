/*
 Write a program to display the sum of the series [ 1+x+x^2/2!+x^3/3!+....].  
Test Data :
Input the value of x :3
Input number of terms : 5
Expected Output :
The sum is : 16.375000
*/package problems;

import java.util.Scanner;
import java.lang.Math;
public class QueThirteen {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
			
		System.out.print("Input the value of x :");
		int x = sc.nextInt();
		
		System.out.print("Input number of terms : ");
		int n = sc.nextInt();

		 System.out.print("Sum is: " + sum(x, n));
		}
	
	
	static double sum(int x, int n)
    {
        double total = 0;
 
        for (int i = 0; i <= n-1; i++) {
            total = total + (Math.pow(x, i) / fact(i));
        }
 
        return total;
    }
	  static int fact(int n)
	    {
	        if (n==1 || n==0)
	            return 1;
	 
	        return n * fact(n - 1);
	    }
}

