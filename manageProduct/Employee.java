public class Employee {
    private String username;
    private boolean authorized;

    public Employee(String username) {
        this.username = username;
        this.authorized = Authentication.checkAuthorization(this); //calls authentication class to check if user is authorized
    }

    public boolean isAuthorized() { //authorization checker
        return authorized;
    }

    public void manageProduct() {
        if (!isAuthorized()) {
            System.out.println("Not authorized to manage product."); //display not authorized page
            return;
        }

        System.out.println("Action: "); //web page displays create and edit buttons for user to choose
        String action = scanner.nextLine(); // simulate user input detection

        if (action.equals("create")) { //simulate if user pressed create product button
            createProduct();
        } else if (action.equals("edit")) { // simulate if user pressed edit product button
            editProduct();
        } else {
            System.out.println("Unknown action");
        }
    }

    private void createProduct() {
        System.out.println("Enter Product Details:"); //web page displays input fields for user to enter product details
        Product product = scanner.nextLine(); //web page receives product details as a product object
        Database.updateProduct(product); // update db to add new product
    }

    private void editProduct(Product product) {
        System.out.println("Editing product: " + product.getName()); //web page displays product name to edit
        Database.updateProduct(product); //update db to edit product
    }
}
