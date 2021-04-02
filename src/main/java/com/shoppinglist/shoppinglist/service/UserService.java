package com.shoppinglist.shoppinglist.service;

import com.shoppinglist.shoppinglist.model.service.UserServiceModel;

public interface UserService {
    boolean register(UserServiceModel map);

    UserServiceModel findByUsernameAndPassword(String username, String password);
}
