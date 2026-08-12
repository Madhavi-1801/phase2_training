package prooo;

class BankAccount {

    int accountNumber;
    String customerName;
    String accountType;
    double balance;


    BankAccount(int accountNumber, String customerName,
                String accountType, double balance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Deposit
    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("₹" + amount + " deposited into Account "
                           + accountNumber);
    }

    // Withdraw
    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;

            System.out.println("₹" + amount + " withdrawn from Account "
                               + accountNumber);
        } 
        else {
            System.out.println("Insufficient balance in Account "
                               + accountNumber);
        }
    }

    // Transfer
    void transfer(BankAccount receiver, double amount) {

        if (amount <= balance) {

            this.balance = this.balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println("₹" + amount + " transferred from Account "
                               + this.accountNumber + " to Account "
                               + receiver.accountNumber);
        } 
        else {
            System.out.println("Transfer failed. Insufficient balance.");
        }
    }

    // Display account details
    void displayAccountDetails() {

        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : ₹" + balance);
    }
}


public class Main {

    public static void main(String[] args) {

        // Creating 3 objects
        BankAccount account1 =
            new BankAccount(101, "Madhavi", "Savings", 0);

        BankAccount account2 =
            new BankAccount(102, "Harini", "Savings", 0);

        BankAccount account3 =
            new BankAccount(103, "Jishnu", "Current", 0);




        account1.deposit(10000);

        account2.deposit(5000);

        account1.transfer(account2, 3000);

        account2.withdraw(2000);



        System.out.println("\n----- FINAL ACCOUNT DETAILS -----");

        account1.displayAccountDetails();

        account2.displayAccountDetails();

        account3.displayAccountDetails();
    }
}