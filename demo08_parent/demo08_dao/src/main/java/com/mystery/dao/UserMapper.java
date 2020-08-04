package com.mystery.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /*获取用户名*/
    String getUserName(Integer id);

}
