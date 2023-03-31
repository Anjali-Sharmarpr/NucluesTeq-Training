package Streams;

//lambda function - implementation of an interface which has functional interface.
//It saves a lot of code.


@FunctionalInterface
interface Calculation{
	public int add(int a,int b);
}


public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           

        //anonymous inner class
		
        Calculation c = new Calculation() {
       	 public int add(int a,int b) {
       		 return (a+b);
       	 } 
        };
        System.out.println("Using Anonymous class");
        System.out.println(c.add(5,6));
		
		//using lambda expression saves a lot of code
        Calculation l = (a,b)-> a+b;
        
        System.out.println("Using Lambda Expression");
        System.out.println(l.add(5, 6));
	}

}
