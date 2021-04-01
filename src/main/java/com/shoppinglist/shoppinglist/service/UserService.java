package com.shoppinglist.shoppinglist.service;

import com.shoppinglist.shoppinglist.model.service.UserServiceModel;

public interface UserService {
    void register(UserServiceModel map);

    UserServiceModel findByUsernameAndPassword(String username, String password);
}
