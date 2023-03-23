package Generics;

//creating generic methods

  class MethodGeneric {
	public <T> void genericMethod( T data) {
	      System.out.println(data);
     }
}

public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		MethodGeneric obj =  new MethodGeneric();
		System.out.print("Integer type:- ");
		obj.genericMethod(10); //integer data 
		
		System.out.print("String type:- ");
		obj.genericMethod("Anjali Sharma"); //string data 
		
	}

}
