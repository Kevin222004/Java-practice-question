/*
Write a C program to calculate the factorial of a given number.  
Test Data :
Input the number : 5
Expected Output :
The Factorial of 5 is: 120
*/

package problems;

public class QueNine {

	public static void main(String[] args) {
		
		System.out.println(fibo(5));
	}

	static int fibo(int n) {
	if(n<2) {
		return n ;
	}
		
		return fibo(n-1) + fibo(n-2);
	}
}
