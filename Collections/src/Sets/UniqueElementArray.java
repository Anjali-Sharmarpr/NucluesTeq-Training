package Sets;

import java.util.*;
public class UniqueElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the no of elements");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		
		//printing array
		for (int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
		Set<Integer> set= new HashSet<Integer>();
		
		for (int i=0;i<n;i++) {
			set.add(arr[i]);
		}


		System.out.println("\n" + set);
		
	}

}
