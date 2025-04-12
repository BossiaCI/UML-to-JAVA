package bank_management;

class Teller extends Employee {

    public Teller(String employeeID, String name, Branch branch) {
        super(employeeID, name, "Teller", branch);
    }

    public void processDeposit(Account account, double amount) {
        account.deposit(amount);
        System.out.println(name + " processed a deposit of " + amount + " to account " + account.getAccountNumber());
    }

    public void processWithdrawal(Account account, double amount) {
        if (account.withdraw(amount)) {
            System.out.println(name + " processed a withdrawal of " + amount + " from account " + account.getAccountNumber());
        } else {
            System.out.println("Withdrawal failed due to insufficient funds or overdraft limit.");
        }
    }
}
