package warehouse_management;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    protected String employeeId;
    protected String name;
    protected String role;
    protected String contactInfo;
    protected Warehouse warehouse;
    protected List<Task> assignedTasks;
    
    // Constructors
    public Employee() {
    }
    public Employee(String employeeId, String name, String role, String contactInfo, Warehouse warehouse) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.contactInfo = contactInfo;
        this.warehouse = warehouse;
        this.assignedTasks = new ArrayList<>();
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
    public Warehouse getWarehouse() {
        return warehouse;
    }
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    public List<Task> getAssignedTasks() {
        return assignedTasks;
    }
    public void setAssignedTasks(List<Task> assignedTasks) {
        this.assignedTasks = assignedTasks;
    }

    public void processTask(Task task){
        System.out.println(name + " is processing task: " + task.getTaskId());
    }

    public void assistWithShipment(Shipment shipment){
        System.out.println(name + " is assisting with shipment: " + shipment.getShipmentId()); 
    }

}
