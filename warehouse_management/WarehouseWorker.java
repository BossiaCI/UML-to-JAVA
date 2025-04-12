package warehouse_management;

public class WarehouseWorker extends Employee {
    public WarehouseWorker(String employeeId, String name, Warehouse warehouse){
        super(employeeId, name,"Warehouse Worker","Info", warehouse);
    }

    @Override
    public void processTask(Task task){
        // todo impl
        super.processTask(task);
        System.out.println(name + " is processing task: " + task.getDescription());
    }
}
