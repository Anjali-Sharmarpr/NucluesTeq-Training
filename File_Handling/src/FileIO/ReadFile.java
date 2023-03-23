package FileIO;

//reading from file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		try {
			File fobj= new File("File3.txt");
			Scanner myReader= new Scanner(fobj);
			
			while(myReader.hasNextLine()) {
				String data= myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
