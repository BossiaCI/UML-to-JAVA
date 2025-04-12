package bank_management;

class Manager extends Employee {

    public Manager(String employeeID, String name, Branch branch) {
        super(employeeID, name, "Manager", branch);
    }

    public void approveLoan(Loan loan) {
        loan.approveLoan();
        System.out.println(name + " approved loan " + loan.getLoanID());
    }

    public void generateReport() {
        // Report generation logic
        System.out.println(name + " generated a report for branch " + branch.getBranchId());
    }
}
