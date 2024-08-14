package com.javaProject3;
class BankAccount {
	 private double balance;

	BankAccount(double initialBalance) {
	     this.balance = initialBalance;
	 }

	 void deposit(double amount) {
	     if (amount > 0) {
	         balance += amount;
	         System.out.println("Deposited: " + amount);
	     } else {
	         System.out.println("Deposit amount must be positive.");
	     }
	 }

	void withdraw(double amount) {
	     if (amount > 0 && amount <= balance) {
	         balance -= amount;
	         System.out.println("Withdrew: " + amount);
	     } else {
	         System.out.println("Insufficient balance or invalid amount.");
	     }
	 }

	 public double getBalance() {
	     return balance;
	 }
	}

	class SavingsAccount extends BankAccount {
	 public SavingsAccount(double initialBalance) {
	     super(initialBalance);
	 }
	 @Override
	 public void withdraw(double amount) {
	     if (getBalance() - amount < 100) {
	         System.out.println("Cannot withdraw. Minimum balance of 100 required.");
	     } else {
	         super.withdraw(amount);
	     }
	 }
	}
public class Banks {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(500);
	     SavingsAccount savings = new SavingsAccount(500);
	     
	     account.deposit(200); 
	     account.withdraw(100); 
	     System.out.println("BankAccount balance: " + account.getBalance()); 
	     
	     savings.deposit(200);
	     savings.withdraw(500);
	     savings.withdraw(300); 
	     System.out.println("SavingsAccount balance: " + savings.getBalance());
	}
}