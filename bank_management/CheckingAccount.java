package bank_management;

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance, "Checking");
        this.overdraftLimit = overdraftLimit;
    }

    // Overridden withdraw method to allow overdraft
    @Override
    public boolean withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void processOverdraft() {
        // Implementation for processing overdraft
        System.out.println("Processing overdraft for account " + accountNumber);
    }

    // Getters and setters
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
