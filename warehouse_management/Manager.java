package warehouse_management;

public class Manager extends Employee {
    public Manager(String employeeID, String name, Warehouse warehouse) {
        super(employeeID, name, "Manager", "info", warehouse);
    }

    public void approveShipment(Shipment shipment) {
        shipment.updateStatus("Approved");
        System.out.println(name + " approved shipment " + shipment.getShipmentId());
    }

    public void generateReport() {
        // Generate reports related to tasks and shipments
        System.out.println(name + " is generating a report for warehouse operations.");
    }
}
