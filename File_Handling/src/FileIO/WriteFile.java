package FileIO;

//writing into a file

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
         FileWriter fobj= new FileWriter("File1.txt");
         fobj.write("Writing into a file using File Writer class");
         fobj.close();
         System.out.println("Successfully wrote to file");
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
