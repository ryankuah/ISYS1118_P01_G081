package browseProducts;

public class DatabaseHandler {
    public Product[] getAllProducts(){
        Product[] products;

        String sql = "SQL query"; //this would be an actual sql database query in real code.
        products = execute(sql); //database called using sql query, returns list of products.

        return products;
    }

    public Product[] getFilterProducts(String[] searchTerms){
        Product[] products;

        String sql = "SQL query (filtered)"; //this would be an actual sql database query in real code and would retrieve products filtered by search terms.
        products = execute(sql); //database called using sql query, returns list of products.

        return products;
    }
}
