package bank_management;

abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String accountType; // Could be "Savings", "Checking", etc.

    protected Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    // Returns true if withdrawal is successful
    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean transferFunds(Account target, double amount) {
        if (this.withdraw(amount)) {
            target.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account[" + accountNumber + ", Balance: " + balance + ", Type: " + accountType + "]";
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }
}
