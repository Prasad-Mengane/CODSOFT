package com.java.dev;
import java.util.*;

class BankAccount{
    private double balance;
    public BankAccount(double initialbalance){
        this.balance = initialbalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Deposited Successfully");
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Amount Withdraw Successfully");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
class ATM{
    private BankAccount UserAccount;
    public ATM(BankAccount account){
        this.UserAccount = account;
    }
    Scanner sc = new Scanner(System.in);
    public void displayMenu(){
        while(true){
            System.out.println("ATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.print("Choose An Option: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            System.out.println("\nThank You For Using ATM");
            break;
        }
    }

    private void checkBalance(){
        System.out.println("Your Balance is: $"+UserAccount.getBalance());
    }
    private void deposit(){
        System.out.print("Enter The Amount: ");
        double amount = sc.nextDouble();
        UserAccount.deposit(amount);
    }
    private void withdraw(){
        System.out.print("Enter The Amount: ");
        double amount = sc.nextDouble();
        UserAccount.withdraw(amount);
    }
}
public class ATMInterface {
	public static void main(String[] args) {
		BankAccount userAccount = new BankAccount(500.0);
		ATM obj = new ATM(userAccount);
		obj.displayMenu();
	}
}
