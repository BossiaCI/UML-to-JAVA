package bank_management;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerID;
    private String name;
    private String address;
    private String contactInfo;
    private List<Account> accounts;

    public Customer(String customerID, String name, String address, String contactInfo) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.accounts = new ArrayList<>();
    }

    

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public String getContactInfo() {
        return contactInfo;
    }



    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }



    public List<Account> getAccounts() {
        return accounts;
    }



    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }



    public String getAccountSummary() {
        StringBuilder sb = new StringBuilder();
        for (Account acc : accounts) {
            sb.append(acc.toString()).append("\n");
        }
        return sb.toString();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void applyForLoan(Loan loan) {
        // Implementation to apply for a loan
        System.out.println(name + " has applied for a loan: " + loan.getLoanId());
    }

    // Getters and setters
    public String getCustomerId() {
        return customerID;
    }
}
