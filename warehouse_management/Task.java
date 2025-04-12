package warehouse_management;

public class Task {
    private String taskId;
    private String description;
    private String taskType; // Picking, packing, shipping...
    private Employee assignedEmployee;

    // Constructors
    public Task() {
    }
    public Task(String taskId, String description, String taskType) {
        this.taskId = taskId;
        this.description = description;
        this.taskType = taskType;
        this.assignedEmployee = null; // the task is not assigned initially to an employee
    }

    // Getters and Setters

    public String getTaskId() {
        return taskId;
    }
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTaskType() {
        return taskType;
    }
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }
    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }
    public void setAssignedEmployee(Employee assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }

    @Override
    public String toString(){
        return "Task[ID: " + taskId + ", Type: " + taskType + ", Assigned to: " + (assignedEmployee == null ? "None" : assignedEmployee.getEmployeeId()) + "]";
    }
}
