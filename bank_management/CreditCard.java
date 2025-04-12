package bank_management;

import java.util.Date;

class CreditCard {
    private String cardNumber;
    private Date expirationDate;
    private double creditLimit;
    private double currentBalance;

    public CreditCard(String cardNumber, Date expirationDate, double creditLimit) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.creditLimit = creditLimit;
        this.currentBalance = 0;
    }

    public boolean charge(double amount) {
        if (currentBalance + amount > creditLimit) {
            return false;
        }
        currentBalance += amount;
        return true;
    }

    public void payBill(double amount) {
        currentBalance -= amount;
        if (currentBalance < 0) {
            currentBalance = 0;
        }
    }

    // Getters and setters
    public String getCardNumber() {
        return cardNumber;
    }
}
