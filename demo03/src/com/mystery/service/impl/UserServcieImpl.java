package com.mystery.service.impl;

import com.mystery.dao.UserMapper;
import com.mystery.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServcieImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /*获取用户名*/
    @Override
    public String getUserName(Integer id) {
        return userMapper.getUserName(id);
    }
}
