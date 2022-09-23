package day_5.p2;

public abstract class Accounts {
	double Balance;
	long AccountNo;
	String HoldersName;
	
	abstract void withdraw();
	abstract void deposit();
	abstract void display();
}

