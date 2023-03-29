package Map;

//implementing  Hashmap <key,value> pair
//every key is unique

/*
 * The Map interface maintains 3 different sets:

the set of keys
the set of values
the set of key/value associations (mapping).
 */

import java.util.Map;
import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Map<Integer,String> mp= new HashMap<Integer,String>();
		
		mp.put(1, "One");   //adding elements into the map
		mp.put(2, "Two");
		mp.put(3, "Three");
		
		System.out.println(mp);
		System.out.println(mp.keySet());   //return keys of map
		
		System.out.println(mp.values());   //return values of map
	   
		System.out.println(mp.entrySet());  //return all the entries
		
		mp.put(4, "Four");
		mp.put(5, "Five");
		
		mp.replace(4, "Four Four");   //replace specified value at specified index
		
		System.out.println(mp);
		  
		mp.replace(4, "Four Four", "Four");   //replace old value with new value
		System.out.println(mp);
		
		System.out.println(mp.containsKey(5));   //return true / false whether key is 
		System.out.println(mp.containsKey(6));   //present in map or not
		
		System.out.println(mp.containsValue("Five"));   //return true / false whether value
		System.out.println(mp.containsValue("Six"));    //is present in map or not
		
		System.out.println(mp.get(3));    //returns element present at index 3
		
		Map<Integer,String> mp2= new HashMap<Integer,String>();
		
		mp2.put(6, "Six");
		mp2.put(7, "Seven");
		
		System.out.println(mp2);
		
		mp.putAll(mp2);     //adds all elements of mp2 into mp
		System.out.println(mp);  
		
		
		
	}

}
