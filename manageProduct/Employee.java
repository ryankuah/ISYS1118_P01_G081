public class Employee extends Account {

    private String department;
    private String branch;
    
    public void addProduct(){
        Product newProduct = new Product();
        //product array add newProduct
    }

    public void updateProduct(Product editProduct){
        //code for updating product info
    }

    public void removeProduct(Product deleteProduct){
        //code for deleting a product
    }

    public String getDepartment(){
        return department;
    }

    public String getBranch(){
        return branch;
    }

    public void setDepartment(String employeeDepartment){
        department = employeeDepartment;
    }

    public void setBranch(String employeeBranch){
        branch = employeeBranch;
    }
}
