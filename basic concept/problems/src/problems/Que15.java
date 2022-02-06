/*
 Write a program  to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.  
Test Data :
Input the number of terms : 5
Expected Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
*/
package problems;
import java.util.Scanner;
public class Que15 {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.print("Input the number of terms : ");
	int n = sc.nextInt();
	
	int t = 1,sum=0;
	
	for(int i =1 ;i<= n ;i++) {
		System.out.print(t + " " + "+" + " ");
		t=(t*10)+1;

		sum = sum + t;
	}
	System.out.println();
	System.out.println("The sum is : " + sum);
	}
}
