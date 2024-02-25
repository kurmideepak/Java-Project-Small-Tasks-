package BankAc;

import java.util.Scanner;

public class BankAccount {
    private String accountNumner;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumner, double initialBalance, String accountHolderName){
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountNumner = accountNumner;
    }
    public void deposit(double amount){
        if (amount >0){
            balance = balance + amount;
            System.out.println("Diposit successful. New Balance: Rs." + balance);
        }
        else {
            System.out.println("Invalid diposit amount. Please enter a positive value.");
        }
    }
    public void withdraw (double amount){
        if (amount>0){
            if (balance>=amount){
                balance = balance - amount;
                System.out.println("Withdrawal successful. New Balance: Rs." + balance);
            }
            else {
                System.out.println("Insufficient Balance. Unable to withdraw");
            }
            }
        else {
            System.out.println("invalid withdrawal amount. Please Enter Positive value.");
        }
        }
        public void displayBalance(){
            System.out.println("The account Balance is: Rs." + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Bank Account System!");
        BankAccount myAc = new BankAccount("1234567890", 1000, "Dipak Kurmi");
        while (true){
            System.out.println("\n Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice (1-4): ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter deposit amount: Rs.");
                    double depositAmount = sc.nextDouble();
                    myAc.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter the withdrawal amount: Rs.");
                    double withdrawAmount = sc.nextDouble();
                    myAc.withdraw(withdrawAmount);
                    break;
                case 3:
                    myAc.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting Bank Account System. Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Please enter the number between 1 and 4.");
            }
        }
    }
}




/*
Documentation:

Purpose:
The Bank Account System is designed to simulate basic back acccount transactions, providing functionality for depositing money, withdrawing funds and checking the account balance. It serves as a simple representation of a user-centric banking experience, allowing users to interact with rtheir acconjt through a console-based interface.

BankAccount Class:
Attributes:
'accountNumber' (String): Holds the unique identifier for the bank account.
'balance' (double): Represent the current balance in the bank account.
'accountHolderName' (String): Stores the name of the account holder.

Constructure:
Initialize the 'accountNumber', 'balance', and 'accountHolderName' attributes when a new bank account object is created.

Methods:
'deposit(double amount)': Handles depositing a positive amount into the account. Display the new balance after the deposit.
'withdraw(double amount)': Handles withdrawing a positive amount from the account. Display the new balance after withdrawal.
'displayBalance()': Display the current account balance.

Main Method:
Initializes a bank account object.
Utilizes a loop for continuous user interaction.
Provides a menu for deposit, withdrawal, balance checking, anb exiting the system.
Utilizes the 'Scanner' class for user input.

Example:
User can deposit, withdraw, and check their account balance. For instance, a user deposits Rs. 500, leading to a new balance of Rs.1500. Subsequently, the user withdraw Rs.800, resulting in a balance of Rs.700. The system provides constant interaction with a menu for seamless transaction.
 */