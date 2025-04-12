package bank_management;

abstract class Employee {
    protected String employeeID;
    protected String name;
    protected String role;
    protected Branch branch;

    protected Employee(String employeeID, String name, String role, Branch branch) {
        this.employeeID = employeeID;
        this.name = name;
        this.role = role;
        this.branch = branch;
    }

    public void processTransaction(Transaction tx) {
        // Common processing logic for employees
        System.out.println(name + " processed transaction: " + tx.getTransactionId());
    }

    public void assistCustomer(Customer cust) {
        // Common assistance logic
        System.out.println(name + " is assisting customer: " + cust.getCustomerId());
    }

    // Getters and setters
    public String getEmployeeID() {
        return employeeID;
    }
}