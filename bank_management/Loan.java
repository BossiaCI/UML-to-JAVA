package bank_management;

class Loan {
    private String loanID;
    private double amount;
    private double interestRate;
    private int term; // in months or years (depending on implementation)
    private String status; // e.g., "Pending", "Approved", "Rejected"

    public Loan(String loanID, double amount, double interestRate, int term, String status) {
        this.loanID = loanID;
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
        this.status = status;
    }

    

    public String getLoanID() {
        return loanID;
    }



    public void setLoanID(String loanID) {
        this.loanID = loanID;
    }



    public double getAmount() {
        return amount;
    }



    public void setAmount(double amount) {
        this.amount = amount;
    }



    public double getInterestRate() {
        return interestRate;
    }



    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }



    public int getTerm() {
        return term;
    }



    public void setTerm(int term) {
        this.term = term;
    }



    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        this.status = status;
    }



    public double calculateMonthlyPayment() {
        // Simplified calculation using a fixed-rate formula (for illustration)
        double monthlyRate = interestRate / 12;
        int n = term;
        return (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -n));
    }

    public void approveLoan() {
        status = "Approved";
        System.out.println("Loan " + loanID + " has been approved.");
    }

    // Getters and setters
    public String getLoanId() {
        return loanID;
    }
}
