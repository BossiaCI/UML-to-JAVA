package warehouse_management;

import java.util.Date;

public class Shipment {
    private String shipmentId;
    private String source;
    private String destination;
    private Date shipmentDate;
    private Date deliveryDate;
    private Date expectedArrivalDate;
    private String status; // eg: "In Transit", "Delivery"....
    private Order order;

    // Constructors
    
    public Shipment() {
    }
    public Shipment(String shipmentId,String source, String destination, Date shipmentDate, Date deliveryDate, Date expectedArrivalDate, Order order) {
        this.shipmentId = shipmentId;
        this.source = source;
        this.destination = destination;
        this.shipmentDate = shipmentDate;
        this.deliveryDate = deliveryDate;
        this.expectedArrivalDate = expectedArrivalDate;
        this.status = "In Transit";
        this.order = order;
    }

    // Getters and Setters

    public String getShipmentId() {
        return shipmentId;
    }
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
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

    public Date getExpectedArrivalDate() {
        return expectedArrivalDate;
    }
    public void setExpectedArrivalDate(Date expectedArrivalDate) {
        this.expectedArrivalDate = expectedArrivalDate;
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

    // update shipment status
    public void updateStatus(String newStatus){
        this.status = newStatus;
    }

    // string repr
    @Override
    public String toString(){
        return "Shipment[ID: " + shipmentId + ", From: " + source + ", To: " + destination + ", Status: " + status + "]";
    }
}
