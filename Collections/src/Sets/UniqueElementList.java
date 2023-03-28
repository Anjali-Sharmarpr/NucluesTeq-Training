package Sets;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class UniqueElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
     Scanner s= new Scanner(System.in);
		
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		
		int temp=(-1);
		
		System.out.println("Enter the no of elements");
		int n= s.nextInt();
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<n;i++) {
			temp=s.nextInt();
			numbers.add(temp);
		}
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		System.out.println(numbers);
		
		//adding all the elements of list into the set 
		//as set do not contains duplicates so it will store only unique values
		
		set1.addAll(numbers);     
		
		System.out.println(set1);
	}

}
