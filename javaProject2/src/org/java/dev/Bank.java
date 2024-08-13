package org.java.dev;
import java.util.ArrayList;
//Define the Account class
class Account {
 private String name;
 private String accountNumber;
 private double balance;
 // Constructor
 public Account(String name, String accountNumber, double balance) {
     this.name = name;
     this.accountNumber = accountNumber;
     this.balance = balance;
 }
 // Getters and Setters
 public String getName() {
     return name;
 }
 public void setName(String name) {
     this.name = name;
 }
 public String getAccountNumber() {
     return accountNumber;
 }
 public void setAccountNumber(String accountNumber) {
     this.accountNumber = accountNumber;
 }
 public double getBalance() {
     return balance;
 }
 public void setBalance(double balance){
     this.balance = balance;
 }
 // Method to deposit money
 public void deposit(double amount) {
     balance += amount;
 }
 // Method to withdraw money
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
     } else {
         System.out.println("Insufficient balance!");
     }
 }
 // Method to get account information
 public String getAccountInfo() {
     return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
 }
}
//Define the Bank class
class Bank1{
 private ArrayList<Account> accounts;
 // Constructor
 public Bank1() {
     accounts = new ArrayList<>();
 }
 // Method to add an account
 public void addAccount(Account account) {
     accounts.add(account);
 }
 // Method to remove an account
 public void removeAccount(String accountNumber) {
     accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
 }
 // Method to deposit money into an account
 public void deposit(String accountNumber, double amount) {
     for (Account account : accounts) {
         if (account.getAccountNumber().equals(accountNumber)) {
             account.deposit(amount);
             return;
         }
     }
     System.out.println("Account not found!");
 }
 // Method to withdraw money from an account
 public void withdraw(String accountNumber, double amount) {
     for (Account account : accounts) {
         if (account.getAccountNumber().equals(accountNumber)) {
             account.withdraw(amount);
             return;
         }
     }
     System.out.println("Account not found!");
 }
 // Method to display all accounts
 public void displayAccounts() {
     for (Account account : accounts) {
         System.out.println(account.getAccountInfo());
     }
 }
}
//Main class to test the Bank and Account classes
public class Bank {
	public static void main(String[] args) {
		Bank1 bank = new Bank1();
        // Create some accounts
        Account account1 = new Account("Alice", "A001", 1000.0);
        Account account2 = new Account("Bob", "A002", 1500.0);
        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        // Display all accounts
        bank.displayAccounts();
        // Deposit money
        System.out.println("Deposited Money");
        bank.deposit("A001", 5000.000);
        bank.withdraw("A002", 200.0);
        // Display all accounts after transactions
        bank.displayAccounts();
        // Remove an account
        bank.removeAccount("A001");
        // Display all accounts after removal
        bank.displayAccounts();
	}
}

