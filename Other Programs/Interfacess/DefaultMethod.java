package Interfacess;

//abstract classes allow functions to be declared as well as defined
//interface only allows functions to be declared not defined
//default method allows function definition in interface
// default return_type method_name{

//   }

abstract class Demo{
	public abstract void show();
	
	public void display() {
		System.out.println("Display method");
	}
}

class Temp extends Demo{

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show method");
	}
	
}
/*
 * Functional interface - can consists only ONE abstract method
 *                      but can contain other type of methods 
 * therefore Inter is an functional interface (even it consists of two methods)
*/

@FunctionalInterface      
interface Inter{    
	void show();
	
	/*void display() {   //will give error
		
	}*/
	
	default void display() {   //default method interface
		System.out.println("Display method");   
	}
}

//implementing

class Ifc implements Inter{
	 public void show() {
		System.out.println("Show Method");
	}
	 
	 //can override the default method
	 public  void display() {
		 System.out.println("Override the display method");
	 }
}
public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           /*
		Temp t= new Temp();
		t.display();
		t.show();
		*/
		
		Inter i = new Ifc();
		i.display();
		i.show();
	}

}
