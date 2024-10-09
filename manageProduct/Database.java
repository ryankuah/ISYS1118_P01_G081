public class Database {
    private Connection conn;
   public Database(){
     conn = database.connect(env.getProperty("database")); //connect to database  
   }
  
   public void updateProduct(Product product){
        String sql = "INSERT INTO products (product) VALUES (?,?,?)"; // simulate db insert call
        execute(sql); //execute db command
   }
   public void getCatalog(){
        String sql = "SELECT * FROM products"; // simulate db select call
        execute(sql); //execute db command
   }
}
