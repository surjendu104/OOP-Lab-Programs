package day_5.p2;

public class Main {
	public static void main(String[] args) {
		
		SavingsAccount sAccount = new SavingsAccount(50000, 123456789, "Ajay");
		sAccount.deposit();
		sAccount.withdraw();
		
		sAccount.setRateOfInterest(12.5);
		
		sAccount.display();
		
		CurrentAccount cAccount = new CurrentAccount(120000, 123456789, "Naman");
		cAccount.setOverDraftLimit(3000);
		cAccount.withdraw();
		cAccount.deposit();
		
		
		cAccount.display();
	}
}
