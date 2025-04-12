package bank_management;

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, "Savings");
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        deposit(interest);
    }

    // Getters and setters
    public double getInterestRate() {
        return interestRate;
    }
}

