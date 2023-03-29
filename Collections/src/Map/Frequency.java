package Map;

//count the frequency of digits and alphabets in given list

import java.util.*;

class Demo{
	void CountFrequency(Map<Character,Integer> map,String input) {
		char arr[]= input.toCharArray();    //converting the string into char array to access letters by index
		
		for(int i=0;i<arr.length;i++) {
			char key=arr[i];
			
			if(map.containsKey(key)) {        //if key already present 
				map.put(key, map.get(key)+1);  //then increment the value by 1   
			}
			else {
				map.put(key, 1);              //else just add it
			}
			
		}

		System.out.println(map);
		
	}
}
public class Frequency {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner s= new Scanner(System.in);
		
		Map<Character,Integer> mp = new HashMap<Character, Integer> ();
		
		System.out.println("Enter the String");
		
		String st= s.next();
		
		Demo d= new Demo();
		d.CountFrequency(mp,st); //passing arguments
		
		
		
	}

}
