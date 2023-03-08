package Abstract;
import Abstract.Shape;
import java.util.Scanner;

 class Circle extends Shape{
	
	 double radius;
	 public Circle(double r) {
		  radius = r;
	 }
	 
	 public void perimeter() {
		 
		 System.out.println( 2 * Math.PI * radius);
	 }
	 
	 public void area() {
		 System.out.println( Math.PI * radius * radius);
	 }

	
}
 
 class Rectangle extends Shape{
	 
	 double length,breadth;
	 
	 public Rectangle(double l,double b) {
		 length=l;
		 breadth=b;
	 }
     public void perimeter() {
		 
		 System.out.println(2*length*breadth);
	 }
	 
	 public void area() {
		 System.out.println(length*breadth );
	 }
 }
 
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter length");
		double length= sc.nextDouble();
		
		System.out.println("enter breadth");
		double breadth=sc.nextDouble();
		
		System.out.println("enter radius");
		double radius = sc.nextDouble();
		
		Circle c= new Circle(radius);
		
		System.out.println(" Circle :- " ); 
		System.out.print(" Area :- " ); 
		c.area();
		System.out.print(" Perimeter :- " ); 
		c.perimeter();
		
		Rectangle r = new Rectangle(length,breadth);
		System.out.println(" Rectangle :- " ); 
		System.out.print(" Area :- " ); 
		r.area();
		System.out.print(" Perimeter :- " ); 
		r.perimeter();
		}

}
