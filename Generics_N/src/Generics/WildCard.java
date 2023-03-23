package Generics;

//implementing upper bound wildcard
import java.util.List;
import java.util.ArrayList;

class Wildcards{
	public void upperBound(List<? extends Number>listName) { 
		//double and integer are subclasses of Number class
		
		System.out.println(listName);
	}
	
	public void lowerBound (List<?super Integer> listName) {
		//printing the lists
		//will take type which is Integer or super classes of integer i.e. Number
		
		System.out.println(listName);
	}
	
	public void unBounded(List<?> listName) {
		//can take any type 
		
		System.out.println(listName);
	}
}
public class WildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		ArrayList<Integer> l1 = new ArrayList();
		l1.add(5);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		
		ArrayList<Double> l2 = new ArrayList();
		l2.add(5.5);
		l2.add(10.5);
		l2.add(15.5);
		l2.add(20.5);
		l2.add(25.5);
		
		Wildcards w = new Wildcards();
		
		System.out.print("Upper Bound:- "); 
		w.upperBound(l1);
		System.out.print("Upper Bound:-  ");
		w.upperBound(l2);
		
		ArrayList<Number> l3 = new ArrayList();
		l3.add(1);
		l3.add(2);
		l3.add(3);
		l3.add(4);
		l3.add(5);
		
		System.out.print("Lower Bound: - ");
		w.lowerBound(l1);
		//w.LowerBound(l2); //can't call double as double is not an integer or super class of integer
		
		System.out.print("Lower Bound : - ");
		w.lowerBound(l3); //can call number as number is super class of integer
		
		ArrayList<String> l4 = new ArrayList();
		
		l4.add("Anjali");
		l4.add("Sharma");
		l4.add("Nisha");
		l4.add("Anji");
		l4.add("Nish");
		
		System.out.println("Un Bounded:-  ");
		w.unBounded(l1);
		w.unBounded(l2);
		w.unBounded(l3);
		w.unBounded(l4);
		
		
		
		
		
	}

}
