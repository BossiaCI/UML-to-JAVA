package warehouse_management;

import java.util.Date;

public class WarehouseSystem {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("WH001","Warehouse 13", "Location A");

        // Create Employees
        Employee manager = new Manager("E001", "John Doe", warehouse);
        Employee worker = new WarehouseWorker("E002", "Jane Smith", warehouse);

        // Create Shipments
        Shipment shipment1 = new Shipment("S001", "Factory A", "Warehouse A", new Date());
        Shipment shipment2 = new Shipment("S002", "Factory B", "Warehouse B", new Date());

        // Add shipments to the warehouse
        warehouse.addShipment(shipment1);
        warehouse.addShipment(shipment2);

        // Create and assign tasks
        Task task1 = new Task("T001", "Pick items for shipment", "Picking");
        Task task2 = new Task("T002", "Pack items for shipment", "Packing");

        warehouse.assignTask(worker, task1);
        warehouse.assignTask(worker, task2);

        // Track shipment
        Shipment trackedShipment = warehouse.trackShipment("S001");
        System.out.println("Tracked Shipment: " + trackedShipment);

        // Process task by worker
        worker.processTask(task1);
    }
}

