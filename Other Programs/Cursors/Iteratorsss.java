package Cursors;
/*
 *  Iterator can be applied on any collection object
 *  its a universal cursor
 *  can be used for both read and remove operations
 *  
 *  can be used by iterator() method
 *  single direction cursor
 *  
 *  1. boolean hasNext()
 *  2. object next()
 *  3. void remove()
 */

import java.util.*;
public class Iteratorsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		
		System.out.println("Array List :- " + al);
		
		Iterator it = al.iterator();  
		
		System.out.println("Iterator :- ");
		while(it.hasNext()) {
			Integer in= (Integer)it.next();
			
			if(in%2==0) {
				System.out.println(in);
			}
			else {
				it.remove();   //will remove odd numbers (feature of iterator)
			}
		}
		System.out.println("Collection (ArrayList) :- ");
		System.out.println(al);   //only odd numbers will present
		
	}

}
