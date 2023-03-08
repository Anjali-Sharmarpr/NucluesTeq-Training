package WeekAssignments;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		
		int principal= sc.nextInt();
		double rate= sc.nextDouble();
		double time = sc.nextDouble();
		
		double simpleInterest = (principal*rate*time)/100; 
		
		System.out.println("Simple Interest is : - " + simpleInterest);
		
		double amount= principal*(Math.pow(1+(rate/100),time ));
		
		double compoundInterest=amount-principal;
		
		System.out.print("Compound Interest is : - ");
		System.out.format("%.4f", compoundInterest);	 //rounding off to four decimal places
	}

}
