import java.util.*;

class Account {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public Account(String name, String accNumber, double initialDeposit) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        this.balance = initialDeposit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " successfully.");
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n====== BANK MANAGEMENT SYSTEM ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: createAccount(); break;
                case 2: depositMoney(); break;
                case 3: withdrawMoney(); break;
                case 4: viewAccountDetails(); break;
                case 5: System.out.println("Thank you for using the system!"); break;
                default: System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);
    }

    static void createAccount() {
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();

        if (accounts.containsKey(accNumber)) {
            System.out.println("Account number already exists!");
            return;
        }

        System.out.print("Enter Initial Deposit Amount: ₹");
        double deposit = sc.nextDouble();
        sc.nextLine(); // consume newline

        Account newAcc = new Account(name, accNumber, deposit);
        accounts.put(accNumber, newAcc);
        System.out.println("Account created successfully!");
    }

    static void depositMoney() {
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();

        Account acc = accounts.get(accNumber);
        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter Amount to Deposit: ₹");
        double amount = sc.nextDouble();
        sc.nextLine();

        acc.deposit(amount);
    }

    static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();

        Account acc = accounts.get(accNumber);
        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter Amount to Withdraw: ₹");
        double amount = sc.nextDouble();
        sc.nextLine();

        acc.withdraw(amount);
    }

    static void viewAccountDetails() {
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();

        Account acc = accounts.get(accNumber);
        if (acc == null) {
            System.out.println("Account not found!");
        } else {
            acc.displayDetails();
        }
    }
}
