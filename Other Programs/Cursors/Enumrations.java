package Cursors;

/* * Cursors are used to retrieve objects one by one from the  collections 
 * 
 * Enumeration - to get objects one by one form the Old Collection objects
 * can create Enumeration objects by using elements method() of vector class 
 * single direction cursor
 * 
 * Enumeration used with vector class
 * consists of two methods-
 * 1. boolean hasMoreElements() 
 * 2. object nextElement()
 * 
 * drawback- used only for legacy class
 *         - can only perform read operations
 */

import java.util.*;

public class Enumrations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Vector<Integer> v= new Vector<Integer>();
		
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		
		System.out.println("Vector:- " + v);
		
		Enumeration e = v.elements();     //elements of v assigning into enumeration object
		
		while(e.hasMoreElements()) {    //if enumeration having more elements then return true
			
			//assigning eleemnts of e into integer in, 
			//since return type of nextELements() is Object type so we are typecasting it
			
			System.out.println("Iterator :- ");
			Integer in = (Integer)e.nextElement();  
			if(in %2==0) {
				System.out.println(in); //print only even numbers
			}
			
		}
		System.out.println("Collection (Vector) :- ");
		System.out.println(v); //print all numbers
		
	}

}
