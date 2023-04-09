package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getUsers();
    public void saveUsers(User user);
}
