//Write a program to copy the elements of one array into another array. 
public class Que4 {

	public static void main(String[] args) {
		
		int[] A = {1,2,3,4,5};
		int[] B = new int[A.length];
		
		System.out.println("The elements of A ");
		for(int i = 0;i<A.length;i++) {
			System.out.print(A[i] + " ");
		}
		
		for(int i = 0;i<A.length;i++) {
			 B[i]=A[i] ;
		}
		System.out.println();
		System.out.println("The elements of A copied in B ");
		for(int i = 0;i<B.length;i++) {
			System.out.print(B[i] + " ");
		}
		
	}

}
