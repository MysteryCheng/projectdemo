package com.mystery.dao;

import com.mystery.entity.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface UserMapper {

    /*获取用户名*/
    String getUserName(Integer id);

}
