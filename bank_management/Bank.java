package bank_management;

import java.util.List;

public class Bank {
    private String bankName;
    private List<Branch> branches;

    
    public Bank(String bankName, List<Branch> branches) {
        this.bankName = bankName;
        this.branches = branches;
    }


    public String getBankName() {
        return bankName;
    }


    public void setBankName(String bankName) {
        this.bankName = bankName;
    }


    public List<Branch> getBranches() {
        return branches;
    }


    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public void addBranch(Branch branch){
        branches.add(branch);
    }

    public void removeBranch(Branch branch){
        branches.remove(branch);
    }
}
