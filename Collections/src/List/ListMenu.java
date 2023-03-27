package List;

//to create a menu program
/*
 *  create a menu program with following options .
   1. add
   2.remove 
   3.display element 
   4.exit 
   program should run until user choose 4th option.

 */

import java.util.*;

public class ListMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int ch =(-1);
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		while(ch!=4) {
			
			System.out.println("\n Enter your choice--" +
			                 "\n 1. Add an element"+
					         "\n 2. Remove an element"+
			                 "\n 3. Display the list"+
					         "\n 4. Exit"
					);
			ch=s.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("\n 1. Enter Manually " +
						          "\n 2. Enter by index ");
				int o=s.nextInt();
				
				switch(o) {
				     
				case 1:
				   System.out.println("Enter the element");
				   int e =s.nextInt();
				   numbers.add(e);
				   break;
				   
				case 2:
					System.out.println("Enter element");
					int el=s.nextInt();
					System.out.println("Enter index");
					int ix=s.nextInt();
					numbers.add(ix,el);		
					break;
					
				default:
					System.out.println("Invalid opions");
					break;
				}
				System.out.println("Element added Successfully");
				break;
				
			case 2:
				System.out.println("Enter the element you want to remove");
				int d= s.nextInt();
				numbers.remove(numbers.indexOf(d));   //getting index of the element
				System.out.println("Element removed sucessfully");
				break;
				
			case 3:
				System.out.println("Displaying the list");
				System.out.println(numbers);
				break;
				
			case 4:
				System.out.println("Terminating...");
				System.exit(0);
				break;
			
			default:
				System.out.println("Invalid . Choose Correct Option");
				break;
			}
		}
		
		
		
	}

}
