package Inheritance;

public class Account {
          
	int AccountNo;
	String name;
	String address;
	int phoneNo;
	String dob;
	double balance;
	public int getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public Account(int accountNo, String name, String address, int phoneNo, String dob, double balance) {
		super();
		AccountNo = accountNo;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.balance = balance;
	}
	
	public void closeAccount() {
		System.out.println("PayEMI Method");
	}
	
	
}
