package warehouse_management;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private String warehouseId;
    private String name;
    private String location;
    private List<InventoryItem> inventoryItems;
    private List<Employee> employees;
    private List<Shipment> shipments;
    private List<Task> tasks;

    // Constructors
    public Warehouse(){}

    public Warehouse(String warehouseId, String name, String location) {
        this.warehouseId = warehouseId;
        this.name = name;
        this.location = location;
        this.inventoryItems = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.shipments = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    // Setters
    public void setWarehouseId(String warehouseId){ //just for illusration purpose it should be generated automatically
        this.warehouseId = warehouseId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setInventoryItems(List<InventoryItem> inventoryItems){
        this.inventoryItems = inventoryItems;
    }

    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }

    // getters
    public String getWarehouseId(){
        return warehouseId;
    }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public List<InventoryItem> getInventoryItems(){
        return inventoryItems;
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public List<Shipment> getShipments(){
        return shipments;
    }

    public List<Task> getTasks(){
        return tasks;
    }

    // adding/removing inventory items
    public void addInventoryItem(InventoryItem item){
        inventoryItems.add(item);
    }

    public void removeInventoryItem(InventoryItem item){
        inventoryItems.remove(item);
    }

    // adding/removing employee
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    // add/remove shipment
    public void addShipment(Shipment shipment){
        shipments.add(shipment);
    }

    public void removeShipment(Shipment shipment){
        shipments.remove(shipment);
    }

    // add/remove task
    public void addTask(Task task){
        tasks.add(task);
    }

    public void removeTask(Task task){
        tasks.remove(task);
    }


    // function to track shipment by id
    public Shipment trackShipment(String shipmentId){
        for (Shipment shipment : shipments) {
            if(shipment.getShipmentId().equals(shipmentId)){
                return shipment;
            }
        }
        return null;
    }

    // function to assign a task to an employee
    public void assignTask(Employee employee, Task task){
        //
    }

}
