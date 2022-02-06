/*
  Write a program  to print all unique elements in an array. 
Test Data :
Print all unique elements of an array:
------------------------------------------
Input the number of elements to be stored in the array: 4
Input 4 elements in the array :
element - 0 : 3
element - 1 : 2
element - 2 : 2
element - 3 : 5
Expected Output :
The unique elements found in the array are:
3 5
 */
import java.util.Scanner;
public class Que5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Input the number of element to be stored in array :");
		 int n = sc.nextInt();
		
		 int[] arr = new int[n];
		 
		 for(int i=0;i<n;i++) {
			 System.out.print("element - " + i + " : ");
			 arr[i] = sc.nextInt();
		 }
		 
		 for(int i = 0;i<n;i++) {
			 if(arr[i] != arr[n-1]) {
				 System.out.print(arr[i] + " ");
			 }
		 }
		 
		 
	}

}
