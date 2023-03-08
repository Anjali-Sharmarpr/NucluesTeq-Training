package Inheritance;

public class LoanAccount extends Account {

	public LoanAccount(int accountNo, String name, String address, int phoneNo, String dob, double balance) {
		super(accountNo, name, address, phoneNo, dob, balance);
		// TODO Auto-generated constructor stub
	}
     
	public void payEMI() {
		System.out.println("PayEMI Method");
	}
	public void topUpLoan() {
		System.out.println("top up method ");
	}
	public void repayment() {
		System.out.println("repayment Method");
	}
}
