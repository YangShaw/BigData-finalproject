package com.shaw.movierecommend.service;

import com.shaw.movierecommend.model.User;
import com.shaw.movierecommend.model.UserCreateForm;

public interface UserService {

    User getUserByUserName(String userName);
    User createNewUser(UserCreateForm form);
}
