package ru.tatarinov.spring_boot.service;


import ru.tatarinov.spring_boot.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);

    public List<User> listUsers();

    public User findUser(int id);

    public User updateUser(User user);

    public void removeUser(int id);
}
