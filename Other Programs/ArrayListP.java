package List;
import java.util.*;
import java.util.ArrayList;

public class ArrayListP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		ArrayList<Integer> num= new ArrayList<Integer>();
	
		num.add(1);
		num.add(2); //adding into the list
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println(num);
		
		num.remove(4); //remove element at index 4
		System.out.println(num);
		
	    num.add(4, 5); //adding element 5 at index 4
	    System.out.println(num);
	    
	    System.out.println(num.contains(5)); //return true or false if element present or not
	    System.out.println(num.get(3).getClass()); //returning class name of element present at index 3
	    
	    //System.out.println(num.iterator());
	    
	    System.out.println(num.get(1));
	    System.out.println(num.indexOf(2)); //getting index of element 2
	    
	    num.clear();   //clears the whole list
	    System.out.println(num);
	    
	    
	    
	}

}
