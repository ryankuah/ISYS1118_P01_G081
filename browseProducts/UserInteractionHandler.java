package browseProducts;

import java.util.ArrayList;

public class UserInteractionHandler {
    DatabaseHandler database

    public ArrayList<Product> browseProducts(){ //user selects browse products, userInteractionHandler calls database and retrieves all products. (all products in current scope).
        ArrayList<Product> productCatalogue; //list of products created to store all products retrieved.
        productCatalogue = database.getAllProducts(); //calls "getAllProducts" which will retrieve all products (in current scope).

        return productCatalogue; //returns list of products retrieved.
    }

    public ArrayList<Product> searchProducts(String[] searchTerms){ //user searches for products via search terms.
        ArrayList<Product> filterProductCatalogue; //list of products created to store and return all products retrieved.
        filterProductCatalogue = database.getFilterProducts(); //calls "getFilterProducts" which will retrieve all products that contain search terms.

        return filterProductCatalogue; //returns list of filtered products.
    }

    public Product selectProduct(Product selectedProduct){ //user selects product
        Product newProduct;
        newProduct = database.getProductInformation(); //more information about product is retrieved from database (information not included in catalogue).
                                                        //in actual code would retrieve individual bits of information (multiple functions).
        return newProduct; //returns product info
    }

    public String addToCart(Product selectedProduct, ShoppingCart userCart){
        String returnMessage; //return message to confirm if product has been added to cart.
        returnMessage = userCart.addToCart(selectedProduct); //adds product to cart.

        return returnMessage; //returns confirmation to be displayed to user.
    }

    public Order checkout(ShoppingCart userCart){
        Order newOrder; //creates new order for user
        newOrder = userCart.checkout(); //newOrder is filled with information

        return newOrder; //order is returned
    }


}
