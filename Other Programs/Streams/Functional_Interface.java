package Streams;

//interface which consists only single function is called functional interface
//annotatios required

@FunctionalInterface
interface Functional{
	public void show();
}

class Get implements Functional{
	public void show() {
		System.out.println("Implementing show using class and interface");
	}
}

public class Functional_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Get g = new Get();
         g.show();
         
         
         //anonymous inner class
         Functional f = new Functional() {
        	 public void show() {
        		 System.out.println("Implementing show using Anonymous class");
        	 }
        	 
         };
         f.show();
         
	}

}
