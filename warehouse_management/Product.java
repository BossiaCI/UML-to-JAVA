package warehouse_management;

public class Product {
    private String productId;
    private String name;
    private String description;
    private double price;

    public Product(){}

    public Product(String productId, String name, String description, double price){
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Setters
    public void setProductId(String productId){
        this.productId = productId;
    }

    public void setName(String name){
        this.name = name;
    }


    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }


    // Getters
    public String getProductId(){
        return productId;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }


    // utils Methods
    public String getProductDetails(){
        return "Product [ID= "+ productId + ", Name= " + name + ", Description= " + description + ", Price= " + price + "]";
    }

}
