package ua.nure.dehtiarov.service;

import ua.nure.dehtiarov.entity.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void update(User user);

    void delete(User user);

    User findUserById(Long id);

    List<User> getAllUsers();

    User findByEmail(String email);

    Boolean authenticate(String email, String password);

}
