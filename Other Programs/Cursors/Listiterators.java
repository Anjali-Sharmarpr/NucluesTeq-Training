package Cursors;

/*
 *  ListIterator-  Bi Directional Cursor forward and backward
 *  along with add and remove , it has replace & adding new object functions
 *  
 *  can be used by ListIterator() method and with any list objects
 *  methods() - 
 *  boolean hasNext() , hasPrevious(), nextIndex()
 *  object next(), previous() , previosIndex()
 *  add(), remove(), set() - will replace the new value with old value
 */

import java.util.*;

public class Listiterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		ArrayList<Integer> al= new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		
		System.out.println("Before Iterator list " + al);
		
		ListIterator it = al.listIterator();
		
		while(it.hasNext()) {
			Integer in = (Integer)it.next();
			Integer index = (Integer)it.nextIndex();   //returns the index
			if(in%2==0) {
				System.out.println(in + " at " + index);
				it.set(100);            //if no is even then replace it with 100
			}
			
		}
		System.out.println("After Iterator list " + al);
		
		while(it.hasPrevious()) {    //iterating from previous (last)
			Integer ele= (Integer)it.previous();
			Integer idx= (Integer)it.previousIndex();  //returns the index
			System.out.println(ele + " at " + idx);
			if(ele==100) {
				it.remove();   //removing the 100 
			}
			
		}
		System.out.println("After another iterator " + al);
	}

}
