package ua.nure.dehtiarov.rest.myapi.controller;

import ua.nure.dehtiarov.rest.myapi.entity.User;

/**
 * Created by dehtiarov on 12/20/2015.
 */
public interface UserAccountController {

    boolean loginUser(User user);

    User getUserByUserModel(User user);

    boolean registerNewUser(User user);

}
