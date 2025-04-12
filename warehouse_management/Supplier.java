package warehouse_management;

import java.util.List;

public class Supplier {
    private String supplierId;
    private String name;
    private String contactInfo;
    private List<Product> productsSupplied;
    

    // Constructors
    public Supplier() {}


    public Supplier(String supplierId, String name, String contactInfo, List<Product> productsSupplied) {
        this.supplierId = supplierId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.productsSupplied = productsSupplied;
    }

    // Getters and Setters
    public String getSupplierId() {
        return supplierId;
    }


    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getContactInfo() {
        return contactInfo;
    }


    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }


    public List<Product> getProductsSupplied() {
        return productsSupplied;
    }


    public void setProductsSupplied(List<Product> productsSupplied) {
        this.productsSupplied = productsSupplied;
    }

    // Supply product method
    public void supplyProduct(Product product){
        productsSupplied.add(product);
    }

    
}
