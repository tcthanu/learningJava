package fita.learning.core.java;

public class AccountDemo {

	public static void main(String[] args) {
		Account x=new Account(1000);
		Account y=new Account(5000);
		x.balanceEnquiry();
		x.deposite(100000);
		x.withdraw(50000);
		y.balanceEnquiry();

	}

}
