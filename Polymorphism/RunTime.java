package Polymorphism;

//run time polymorphism - method overriding

class Parent{
	
	 void print() {
		 System.out.println("We are in parent class ");
	 }
	 
}

class Child extends Parent{
	
	void print() {
		System.out.println("We are in child class");
	}
}

class Child2 extends Parent{
	
	void print() {
		
		System.out.println("We are in child 2 class");
	}
}

public class RunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Parent p = new Parent();
		p.print();
		
		Child c = new Child();
		c.print();
		
		Child2 k= new Child2();
		k.print();
		
	}

}
