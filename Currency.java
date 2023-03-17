package WeekAssignments;
import java.util.Scanner;

//currency conversion program

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your curency"); //enter the currency
		String yourCurr= sc.next();
		System.out.println("Enter amount");  //enter the amount
		double amount = sc.nextDouble();
		
		System.out.println("Enter the currency you want conversion: - "); //enter the currency in which we want to convert
		String curr = sc.next();
		double ans;
		
		
		if(yourCurr.equals("Rupees")) { //if it is rupees
			//checks for all other currency
			switch(curr) {
		
		     case "Dollar" :
			   ans= amount * 0.012;
			   System.out.println(String.format("%.2f", ans) + " Dollars ");
			  break;
			
		     case "Euro" :
			   ans= amount * 0.011;
			   System.out.println(String.format("%.2f", ans) + " Euro ");
			 break;
			
		     case "Yen" :
			   ans = amount * 1.60;
			   System.out.println(String.format("%.2f", ans) + " Yen ");
			 break;
			
		     default:
			   System.out.println("Not a valid cuurency");
			 break;
			
		    }
		}
		
		if(yourCurr.equals("Dollar")) { //if it is dollar
			//checks for all other currency
			switch(curr) {
		
		     case "Rupees" :
			   ans= amount * 82.60;
			   System.out.println(String.format("%.2f", ans) + " Rupees ");
			  break;
			
		     case "Euro" :
			   ans= amount * 0.94;
			   System.out.println(String.format("%.2f", ans) + " Euro ");
			 break;
			
		     case "Yen" :
			   ans = amount * 131.95;
			   System.out.println(String.format("%.2f", ans) + " Yen ");
			 break;
			
		     default:
			   System.out.println("Not a valid cuurency");
			 break;
			
		    }
		}
		
		if(yourCurr.equals("Euro")) { //if it is euro
			//checks for all other currency
			switch(curr) {
		
		     case "Dollar" :
			   ans= amount * 1.06;
			   System.out.println(String.format("%.2f", ans) + " Dollars ");
			  break;
			
		     case "Rupees" :
			   ans= amount * 87.77;
			   System.out.println(String.format("%.2f", ans) + " Rupees ");
			 break;
			
		     case "Yen" :
			   ans = amount * 140.23;
			   System.out.println(String.format("%.2f", ans) + " Yen ");
			 break;
			
		     default:
			   System.out.println("Not a valid cuurency");
			 break;
			
		    }
		}
		
		if(yourCurr.equals("Yen")) { //if it is rupees
			//checks for all other currency
			switch(curr) {
		
		     case "Dollar" :
			   ans= amount * 0.0076;
			   System.out.println(String.format("%.2f", ans) + " Dollars ");
			  break;
			
		     case "Euro" :
			   ans= amount * 0.0071;
			   System.out.println(String.format("%.2f", ans) + " Euro ");
			 break;
			
		     case "Rupees" :
			   ans = amount * 0.62;
			   System.out.println(String.format("%.2f", ans) + " Rupees ");
			 break;
			
		     default:
			   System.out.println("Not a valid cuurency");
			 break;
			
		    }
		}
		
		
		
		
	}

}
