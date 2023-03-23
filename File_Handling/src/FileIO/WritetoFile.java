package FileIO;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


//writing to a file using file output stream

class SetFile{
	public void writeFile(String path,OutputStream obj) throws Exception {
		
		Scanner s = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("Enter the message you want into your file");
		String data = "";
		data += s.next();
		
		byte[] array = data.getBytes();
	    
	    obj.write(array);
	    System.out.println("Successfully written to the file");
	    	
	  		
	  	//close output stream
			obj.close();
    }
}
public class WritetoFile {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
         
		
		System.out.println("Enter the file path");
		
		String path = s.next() ;
		
		OutputStream out = new FileOutputStream(path);
		
		SetFile fobj = new SetFile();
		fobj.writeFile(path, out);
		
		
	}

}
