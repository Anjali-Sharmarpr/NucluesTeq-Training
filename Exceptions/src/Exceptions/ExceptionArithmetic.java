package Exceptions;

//arithmetic exception - divide by zero 
public class ExceptionArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int i=10;
		int j=0;
		
		int result;
		
		try {
			result = i/j;
			
		}
		//arithmetic exception divide by zero 
		
		catch(ArithmeticException e){
			System.out.println( "Exception " + e);
		}
		
		//can pass string message as well according to what you want 
		
		int a= 15,b=20;
		
		int ans = a/b;
		
		try {
			if(ans==0) {
				throw new ArithmeticException("can't divide divisor is greater than dividend");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
			
		
	}

}

