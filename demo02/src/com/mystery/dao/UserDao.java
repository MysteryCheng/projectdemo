package com.mystery.dao;

import com.mystery.entity.User;
import com.mystery.utils.JDBCUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    /*获取操作数据库的操作对象*/
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());

    /*获取用户名*/
    public String getUserName(Integer id) {
        String sql = "select username from user where id = ? ";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),id);
        return user.getUsername();
    }
}
