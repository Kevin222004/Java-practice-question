/*
 2. Write program to find the sum of first 10 natural numbers.  
Expected Output :
The first 10 natural number is :
1 2 3 4 5 6 7 8 9 10
The Sum is : 55
 */

package problems;

public class QueTwo {

	public static void main(String[] args) {
			
			int sum = 0;
		    System.out.println("The first 10 natrual number is : ");
		    for(int i = 1; i <= 10; i++)
		    {
		      System.out.print(i + " ");
		      sum = sum + i;
		    }
		 System.out.println(" ");
		 System.out.println("The sum is : " + sum);
	}

}
