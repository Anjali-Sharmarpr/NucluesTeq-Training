package FileIO;
import java.io.File;
import java.io.IOException;


public class CreateFile {
   public static void main(String args[]) {
	   
	   try {
		   File fileObj=  new File("File3.txt");
		   
		   if(fileObj.createNewFile()) {
			   System.out.println("File Created : - " + fileObj.getName());
		   }
		   else {
			   System.out.println("File Already exixts");
		   }
	   }catch(IOException e) {
		   System.out.println("Exception occurred");
		   e.printStackTrace();
	   }
	   
   }
}
   
   
