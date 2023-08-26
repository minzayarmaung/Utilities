package OOP.Encapsulation;

public class BankAccountDemo {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public void BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw Successfully");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public static void main(String[] args) {
        BankAccountDemo ba = new BankAccountDemo();
        ba.BankAccount("007", 5800.56 ,"Kyaw");
        ba.withdraw(5000);
        ba.deposit(4000);
    }
}

