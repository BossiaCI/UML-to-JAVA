package warehouse_management;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private Date orderDate;
    private String status;
    private Customer customer;
    private List<OrderItem> orderItems;

    
    public Order() {}

    public Order(String orderId, Date orderDate, String status, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = status;
        this.customer = customer;
        this.orderItems = new ArrayList<>();
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }


    // Add Order item to Order
    public void addOrderItem(OrderItem item){
        orderItems.add(item);
    }

    // remove Order Item to Order
    public void removeOrderItem(OrderItem item){
        orderItems.remove(item);
    }

    // calculate total order
    public double calculateTotal(){
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getTotalPrice();
        }
        return total;
    }

}
