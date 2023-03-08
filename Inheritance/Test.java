package Inheritance;

import Inheritance.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		LoanAccount la = new LoanAccount(123,"Anjali ","azx",4578,"7-9-2001",2300);
		la.closeAccount();
		la.payEMI();
		la.repayment();
		la.topUpLoan();
		
		System.out.println(la.getAccountNo());
		System.out.println(la.getAddress());
		System.out.println(la.getDob());
		System.out.println(la.getName());
		System.out.println(la.getPhoneNo());
		
		
		
		SavingsAccount sa= new SavingsAccount(456,"Nisha ","abc",47812,"7-9-2001",4577);
		sa.closeAccount();
		sa.withdraw();
		sa.deposit();
		sa.fixedDeposit();
		
		System.out.println(sa.getAccountNo());
		System.out.println(sa.getAddress());
		System.out.println(sa.getBalance());
		System.out.println(sa.getDob());
		System.out.println(sa.getName());
		System.out.println(sa.getPhoneNo());
		
	}

}
