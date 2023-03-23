package Exceptions;

//use of throw and throws keyword
//

class Try {
	public int divide() throws ArithmeticException{ //will throw if any arithmetic exception will be present inside the method
		int i=5,j=0;
		int result = i/j;
		return (result);
	}
}
public class UseOfThrowsVSThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Try t = new Try();
        int ans=-1;
        try {
      	   ans=t.divide();
      	   
      	   if(ans==0) {
      		   throw new ArithmeticException("Answer is zero "); //will throw when answer will be zero
      	   }
        }
         catch(Exception e) {
      	   System.out.println(e);
         }
        
        System.out.println(ans); //will print real value if everything is fine
                                 //will print -1 if throws exception occur
                                 //will print 0 if throw exception occur
	}

}

