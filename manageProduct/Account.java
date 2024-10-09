public class Account {
    private int userID;
    private String username;
    private String name;

    public int getUserID(){
        return userID;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String inputUsername){
        username = inputUsername;
    }

    public String getName(){
        return name;
    }

    public void setName(String inputName){
        name = inputName;
    }
}
