public class Product {

    private int productID;
    private String productName;
    private double productPrice;
    private String productDescription;

    public int getProductID(){
        return productID;
    }

    public String getProductName(){
        return productName;
    }

    public double getProductPrice(){
        return productPrice;
    }

    public String getProductDescription(){
        return productDescription;
    }

    public void setProductName(String newName){
        productName = newName;
    }

    public void setProductPrice(double newPrice){
        productPrice = newPrice;
    }

    public void setProductDescription(String newDescription){
        productDescription = newDescription;
    }
}
