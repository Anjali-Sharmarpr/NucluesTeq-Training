package Polymorphism;

//compile time polymorphism - function overloading 

class Sum{
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public double add(double a,double b, double c) {
		return a+b+c;
	}
	
}
public class CompileTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Sum s = new Sum();
		int n1=10,n2=20,n3=30;
		
		double d1=10.0,d2=20.0,d3=30.0;
		
		//calling all sum methods
		
		System.out.println("Two integer - "+ s.add(n1, n2));
		System.out.println("Three integer - " + s.add(n1, n2,n3));
		System.out.println("Two double - " + s.add(d1, d2));
		System.out.println("Three double - " + s.add(d1, d2,d3));
		
		
	}

}
