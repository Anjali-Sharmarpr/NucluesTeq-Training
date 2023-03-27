package List;

//store only unique elemenst in arraylist
/*
 *    e.g list - [1,2,1,2,1,2,1,2,1]
      o/p list- [1,2]

 */

import java.util.*;

public class UniqueElements {

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
			
			if(!numbers.contains(temp)) { //if element not present then only insert
				numbers.add(temp);
			}
	
		}
		System.out.println(numbers);
		
		
	}

}
