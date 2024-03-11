package practice;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private List<User> users;

    public Users() {
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) { users.add(user); }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void displayUser() {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
