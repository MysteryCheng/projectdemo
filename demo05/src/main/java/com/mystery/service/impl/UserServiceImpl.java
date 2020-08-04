package com.mystery.service.impl;

import com.mystery.dao.UserDao;
import com.mystery.service.IUserService;

public class UserServiceImpl implements IUserService {
    private UserDao userDao = new UserDao();

    /*获取用户名*/
    @Override
    public String getUserName(Integer id) {
        return userDao.getUserName(id);
    }
}
