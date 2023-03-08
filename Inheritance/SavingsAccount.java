package Inheritance;
import Inheritance.*;

public class SavingsAccount extends Account{

	public SavingsAccount(int accountNo, String name, String address, int phoneNo, String dob, double balance) {
		super(accountNo, name, address, phoneNo, dob, balance);
		// TODO Auto-generated constructor stub
	}
     
	public void withdraw() {
		System.out.println("withdraw Method");
	}
	public void deposit() {
		System.out.println("deposit Method");
	}
	public void fixedDeposit() {
		System.out.println("fixed deposit Method");
	}
}
