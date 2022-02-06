/*
 Write a program  to find the sum of all elements of the array. 
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 2
element - 1 : 5
element - 2 : 8
Expected Output :
Sum of all elements stored in the array is : 15

 */
import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Input the number of element to store in array  :");
		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("element - " + i + " : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		System.out.println(); 
		System.out.println("The sum of all elements stored is :" + sum);
		
		

	}

}
