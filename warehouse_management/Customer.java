package warehouse_management;

import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String contactInfo;
    private List<Order> orders;

    // Constructors
    public Customer() {
    }
    public Customer(String customerId, String name, String address, String contactInfo, List<Order> orders) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.orders = orders;
    }

    // Getters and Setters

    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }
}
