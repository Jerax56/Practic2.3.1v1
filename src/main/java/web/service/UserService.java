package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();

    public void saveUsers(User user);

    public User getUser(int ID);

    public void updateUser(User user);

    public void deleteUser(int ID);
}
