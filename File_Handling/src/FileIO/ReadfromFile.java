package FileIO;

//reading data from file using input stream

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class GetFile{
	public void readFile(String path,InputStream obj) throws Exception {
		
	    //byte array , available()- returns the file size(no of byte present in the file)
		
		byte[] array = new byte[obj.available()]; 
	    
	    obj.read(array);
	    System.out.println("Data read from the file  :-");
	    
	  //convert byte array into string
	  		String data = new String(array);
	  		System.out.println(data);
	  		
	  		
	  	//close input stream
			obj.close();
    }
}

public class ReadfromFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		byte[] array = new byte[25];
        
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the file path");
		String path = s.next();
		
		//passing file path into the input stream
		InputStream input = new FileInputStream(path);
		
		GetFile r= new GetFile();
		r.readFile(path,input); //calling function read file to read the data
	     
		
	}

}
