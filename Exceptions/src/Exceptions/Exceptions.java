package Exceptions;

//array index out of bound exception
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int arr[]= new int [5];
		
		try {
		System.out.println(arr[5]); //array index out of bound exception
		}
		catch(Exception e){
			System.out.println(e); //showing the exception 
		}
		
		//Null pointer exception
		
		Integer num= null;
		
		try {
		if(num>0) {
			System.out.println("Positive number");
		 }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}

