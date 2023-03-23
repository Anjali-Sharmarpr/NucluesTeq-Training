package Employee;

//adding employee details into the file

import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class AddEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s = new Scanner(System.in).useDelimiter("\n");
		
		  try {
			  
			  File file = new File("employee.txt");
			  FileWriter fobj = new FileWriter(file,true);
			  
			  //enter employee name
			  System.out.println("Enter employee name");
			  String empName = s.next();
			  
			  fobj.write("Employee name:- " + empName);
			  
			  //employee company name
			  System.out.println("Enter employee company name");
			  String empCom= s.next();
			  
			  fobj.write("Employee Company name:- " + empCom);
			  
			  //employee post
			  System.out.println("Enter the job role");
			  String empJob = s.next();
			  
			  fobj.write("Employee Job Role:- " + empJob );
			  
			  fobj.write("------x------");
			  fobj.append("\n");
			  
			  System.out.println("Employee Details Added Successfully ");
			  
			  fobj.close();
			  
		  }catch(Exception e) {
			  System.out.println("An error occured");
		  }
	}

}
