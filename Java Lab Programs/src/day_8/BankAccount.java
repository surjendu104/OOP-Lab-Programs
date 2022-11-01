package day_8;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();
		ac.setBalance(50000);
		System.out.print("Enter the withdrawing amount : ");
		long amount = sc.nextLong();
		try {
			long temp = ac.getBalance();
			if (temp - amount > 1000) {
				System.out.println("Withdrawed " + amount);
			} else {
				sc.close();
				throw new Exception();
			}

		} catch (Exception e) {
			System.out.println("Account balance getting less than 1000 after withrawing. Can't withdraw");
		}
		sc.close();
	}
}

class Account {
	private long balance;

	Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
}
/*
 * out-1 
 * Enter the withdrawing amount : 50000 
 * Account balance getting less than 1000 after withrawing. Can't withdraw
 * 
 * out-2 
 * Enter the withdrawing amount : 3000 
 * Withdrawed 3000
 */