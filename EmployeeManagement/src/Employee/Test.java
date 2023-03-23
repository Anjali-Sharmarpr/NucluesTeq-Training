package Employee;
import Employee.AddEmployee;
import Employee.ReadAll;
import Employee.ReadEmployee;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
           
		Scanner i = new Scanner(System.in);
		System.out.println("Employee Management system");
		System.out.println("You can add new employee details and read an employee detail");
		
		int c =(-1);
		
		while(c!=4) {
			
			
		System.out.println("Select :- ");
		System.out.println("1 - To add a new Employee Details");
		System.out.println("2 - To read a Employee Detail");
		System.out.println("3 - To read the whole File");
		System.out.println("4 - To exit");
		
		 c = i.nextInt();
		
	
		switch(c) {
		 case 1:
			AddEmployee.main(args);
			break;
		
		 case 2 :
			ReadEmployee.main(args);
			break;
		 case 3 :
			ReadAll r= new ReadAll();
			r.readAll();
			break;
			
		 case 4:
			 System.out.println("Terminated.....");
			break;
			
		default:
			System.out.println("Invalid option");
		}
		
		
	}	
		
	}

}
