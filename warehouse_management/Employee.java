package warehouse_management;

public class Employee {
    private String employeeId;
    private String name;
    private String role;
    private String contactInfo;
    
    // Constructors
    public Employee() {
    }
    public Employee(String employeeId, String name, String role, String contactInfo) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void assignTask(String task){
        System.out.println("Task '" + task + "' assigned to " + name);
    }
}
