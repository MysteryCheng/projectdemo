package com.mystery.dao;



import com.mystery.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserDao {

    /*获取用户名*/
    public String getUserName(Integer id) {

        /*获取连接数据库的五步操作*/
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> list = new ArrayList();
        User user = new User();
        try {
            /*1,加载驱动，在jdk1.6之后可以省略这一步*/
            Class.forName("com.mysql.jdbc.Driver");
            /*2,获取连接*/
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
            /*3,编译SQL*/
            String sql = "select username from user where id = ? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(id,id);
            /*4,执行SQL*/
            resultSet = preparedStatement.executeQuery();
            /*5,处理结果集*/
            while(resultSet.next()){

                user.setUsername(resultSet.getString(1));
                list.add(user);
            }


        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        } finally {
            /*释放资源,不作非空判断了*/
            try {
                if (resultSet!=null){
                    resultSet.close();
                }
                if(preparedStatement!=null){
                    preparedStatement.close();
                }
                if(connection!=null){
                    connection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return user.getUsername();
    }
}
