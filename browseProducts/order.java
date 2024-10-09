package browseProducts;

public class Order {
    private ArrayList<Product> orderedProducts;
    private String orderStatus;

    public Order() {
        orderedProducts = new ArrayList<>();
        orderStatus = "Processing"; //can later be updated to other states like "Shipped", "Delivered", or "Cancelled" depending on the order's lifecycle.
    }

    public void setOrderedProducts(ArrayList<Product> products) {
        this.orderedProducts = products;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }
}
