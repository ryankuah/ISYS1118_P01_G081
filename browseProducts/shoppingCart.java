package browseProducts;

public class ShoppingCart {
    private ArrayList<Product> cartItems = new ArrayList<>();

    public String addToCart(Product product) {
        cartItems.add(product);
        return "Product added to cart";
    }

    public Order checkout() {
        Order order = new Order(); //creating a new order with cartItems
        return order;  // populating order details with items in the cart
    }

    public ArrayList<Product> getCartItems() {
        return cartItems;
    }
}
