package Exceptions;

class AnjaliException extends Exception{
	
	public AnjaliException(String str) { //constructor
		super(str);     //calling parameterized(string)constructor of parent class
	}
	
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a=15;
		int b = 20;
		int result;
		
		try {
			result=a/b;
			if(result==0) {
				throw new AnjaliException("Dividend is smaller than zero"); //passing string
			}
		}
		catch(Exception e){
			System.out.println("Anjali's Exception " + e);
		}
	}

}
