import java.util.HashMap;
import java.util.Map;

class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}
public class UserAuthentication {
    private Map<String, String> users = new HashMap<>();

    public UserAuthentication() {
        // Add some dummy users
        users.put("user1", "password1");
        users.put("user2", "password2");
    }

    public void login(String username, String password) throws InvalidLoginException {
        if (!users.containsKey(username) || !users.get(username).equals(password)) {
            throw new InvalidLoginException("Invalid username or password");
        }
        System.out.println("User " + username + " logged in successfully");
    }

    public static void main(String[] args) {
        UserAuthentication auth = new UserAuthentication();

        try {
            auth.login("user1", "password1"); // Successful login
            auth.login("user2", "wrongpassword"); // This will throw an exception
        } catch (InvalidLoginException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
