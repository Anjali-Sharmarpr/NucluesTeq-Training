package Employee;
import Employee.*;

//read a specific employee by name

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

class ReadAll {
	
	public void readAll() throws Exception {
		
		File fobj= new File("employee.txt");
	   Scanner myReader= new Scanner(fobj);
		
	  while(myReader.hasNextLine()) {
		String data= myReader.nextLine();
		System.out.println(data);
	  }
	myReader.close();
	}
	
}
	
public class ReadEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Scanner s = new Scanner(System.in);
		boolean flag=false;
		int count=1;
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader("employee.txt"));
			
			System.out.println("please enter any employee name to get the record");
            String searchKey=s.next();
            String line;
            
            
            while ((line=reader.readLine())!=null){
                if(   line.contains(searchKey)){
                	System.out.println(line);
                	while(count<=2) {
                		line=reader.readLine();
                		System.out.println(line);
                		count++;
                	}
                	
                    
                      flag=true;
                }
            }
            if(flag==false) {
            	System.out.println("Data not found");
            }
            
		}
		catch(Exception e) {
			System.out.println("An error occurred");
		}
		
	}

}
