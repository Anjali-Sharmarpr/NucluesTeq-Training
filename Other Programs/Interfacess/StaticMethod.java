package Interfacess;

/*
 *  Interface can have static methods as well
 */

@FunctionalInterface
interface Static{
	void show();
	
	//static method
	static void display() {
		System.out.println("Static method");
	}
}

class Test implements Static{
	public void show() {
		System.out.println("Show Method");
	}
	//can override the static method
	public static  void display() {
		System.out.println("Override Display method");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Static s = new Test();
		s.show();
		// Test t = new Test();
		 //t.display();
		
		Static.display();    //calling static methods using class 
		Test.display();
	}

}
