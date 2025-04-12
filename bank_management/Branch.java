package bank_management;

import java.util.ArrayList;
import java.util.List;

class Branch {
    private String branchId;
    private String location;
    private List<Employee> employees;
    private List<Account>  accounts;
    private List<Customer> customers;

    public Branch(String branchId, String location) {
        this.branchId = branchId;
        this.location = location;
        this.employees = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    // add/remove actions

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }


    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
    public void removeAccount(Account account){
        accounts.remove(account);
    }
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    
}
