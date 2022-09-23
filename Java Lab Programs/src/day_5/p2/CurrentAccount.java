package day_5.p2;

import java.util.Scanner;

public class CurrentAccount extends Accounts{
	Scanner sc = new Scanner(System.in);
	private double overDraftLimit;

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	public CurrentAccount(double Balance,long AccountNo,String HoldersName) {
		this.Balance = Balance;
		this.AccountNo = AccountNo;
		this.HoldersName = HoldersName;
	}
	
	public void withdraw() {
		System.out.print("Enter the amount to withdraw : ");
		double num=sc.nextDouble();
		if(num<=Balance ){
			if(num>=getOverDraftLimit()) {
				System.out.println("You have crossed overdraft limit. Over draft limit : "+getOverDraftLimit());
				return;
			}
			Balance-=num;
			System.out.println("You have withdrawd "+num+" rupees");
			}
		else {
			System.out.println("Not sufficient balance.Your current account balance is : "+Balance);
			};
		calculateAmount();
	}
	
	public void deposit() {
		System.out.print("Enter the amount to deposit : ");
		double num=sc.nextDouble();
		Balance+=num;
		System.out.println("You have withdrawd "+num+" rupees");
		calculateAmount();
	}
	
	public void calculateAmount() {
		System.out.println("Account balance is : "+Balance);
	}
	
	public void display() {
		System.out.println("Account Balance : "+Balance+"\nOver draft Limit : "+getOverDraftLimit());
	}
}
