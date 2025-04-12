package warehouse_management;

// not really loosely couple with Product and Supplier but we are applying oop principles 
// by converting uml to java for educational purpose only


public class InventoryItem {
    private String binLocation;
    private int quantity;
    private int reorderLevel;
    private Product product;
    private Supplier supplier;

    public InventoryItem() {}

    public InventoryItem(String binLocation, int quantity, int reorderLevel, Product product, Supplier supplier){
        this.binLocation = binLocation;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
        this.product = product;
        this.supplier = supplier;
    }
    

    // Setters
    public void setBinLocation(String binLocation){
        this.binLocation = binLocation;
    }

    public void setQuantity(int qty){
        this.quantity = qty;
    }

    public void setReorderLevel(int reorderLevel){
        this.reorderLevel = reorderLevel;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public void setSupplier(Supplier supplier){
        this.supplier = supplier;
    }


    // Getters
    public String getBinLocation(){
        return binLocation;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getReorderLevel(){
        return reorderLevel;
    }

    public Product getProduct(){
        return product;
    }

    public Supplier getSupplier(){
        return supplier;
    }


    // Methods utils
    public void updateQuantity(int qty){
        this.quantity = qty;
    }

    public boolean needsReorder(){
        return quantity <= reorderLevel;
    }


}
