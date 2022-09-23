package day_5.p2;

import java.util.Scanner;

public class SavingsAccount extends Accounts{
	Scanner sc=new Scanner(System.in);
	private double rate_of_interest;
	
	public void setRateOfInterest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}
	public double getRateOfInterset() {
		return rate_of_interest;
	}
	public SavingsAccount(double Balance,long AccountNo,String HoldersName) {
		this.Balance = Balance;
		this.AccountNo = AccountNo;
		this.HoldersName = HoldersName;
	}


	public void withdraw() {
		System.out.print("Enter the amount to withdraw : ");
		double num=sc.nextDouble();
		if(num<=Balance){
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
		System.out.println("Account Balance : "+Balance+"\nRate of interest : "+getRateOfInterset());
	}
}
