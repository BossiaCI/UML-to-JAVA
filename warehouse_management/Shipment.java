package warehouse_management;

import java.util.Date;

public class Shipment {
    private String shipmentId;
    private Date shipmentDate;
    private Date deliveryDate;
    private String status;
    private Order order;

    // Constructors
    
    public Shipment() {
    }
    public Shipment(String shipmentId, Date shipmentDate, Date deliveryDate, String status, Order order) {
        this.shipmentId = shipmentId;
        this.shipmentDate = shipmentDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.order = order;
    }

    // Getters and Setters

    public String getShipmentId() {
        return shipmentId;
    }
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    public Date getShipmentDate() {
        return shipmentDate;
    }
    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }
    public Date getDeliveryDate() {
        return deliveryDate;
    }
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    public String trackShipment(){
        return "Shipment " + shipmentId + " is currently " + status;
    }
}
