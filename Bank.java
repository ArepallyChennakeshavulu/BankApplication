

import java.util.Scanner;

public class Bank {
    static int currentBalance = 10000;
    static Scanner scanner = new Scanner(System.in);

    public static void customer() {
        System.out.println("Hi, Welcome to the Bank");
    }

    public void deposit(int amount) {
        currentBalance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public static void withdraw(int amount) {
        if (amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    public int currentBalance() {
        return currentBalance;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        customer();

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance is: $" + bank.currentBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    int depositAmount = scanner.nextInt();
                    bank.deposit(depositAmount);
                    System.out.println("Current balance is: $" + bank.currentBalance());
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println("Current balance is: $" + bank.currentBalance());
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the application. Thank you for using our services!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Please enter your choice: ");
    }
}
