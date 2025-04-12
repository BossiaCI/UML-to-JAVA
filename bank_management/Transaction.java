package bank_management;

import java.util.Date;

class Transaction {
    private String transactionID;
    private Date date;
    private double amount;
    private String type; // e.g., "Deposit", "Withdrawal", "Transfer"
    private Account sourceAccount;
    private Account destinationAccount; // Optional: null for non-transfer transactions

    public Transaction(String transactionID, Date date, double amount, String type, Account sourceAccount, Account destinationAccount) {
        this.transactionID = transactionID;
        this.date = date;
        this.amount = amount;
        this.type = type;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
    }

    

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }



    public Date getDate() {
        return date;
    }



    public void setDate(Date date) {
        this.date = date;
    }



    public double getAmount() {
        return amount;
    }



    public void setAmount(double amount) {
        this.amount = amount;
    }



    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }



    public Account getSourceAccount() {
        return sourceAccount;
    }



    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }



    public Account getDestinationAccount() {
        return destinationAccount;
    }



    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }



    public boolean execute() {
        // Simplified transaction processing logic
        switch (type) {
            case "Deposit":
                sourceAccount.deposit(amount);
                return true;
            case "Withdrawal":
                return sourceAccount.withdraw(amount);
            case "Transfer":
                if (destinationAccount != null) {
                    return sourceAccount.transferFunds(destinationAccount, amount);
                }
                return false;
            default:
                return false;
        }
    }

    // Getters and setters
    public String getTransactionID() {
        return transactionID;
    }
}