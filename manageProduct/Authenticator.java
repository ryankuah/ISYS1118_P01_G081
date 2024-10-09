
public class Authenticator {

    public static boolean checkAuthorization(Admin admin) {
        boolean authorized = checkAuth(admin); //simulated authorization checker that returns true or false depending on the admin
        return authorized;
    }
}
