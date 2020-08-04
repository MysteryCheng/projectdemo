package com.mystery.utils;



import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JDBC工具类 使用Durid连接池
 */
public class JDBCUtil {
    /*1、通过静态代码块获取连接池信息*/
    private static DataSource dataSource;

    static{
        try {

        /*a.加载配置文件*/
        Properties properties = new Properties();
        /*将配置文件转换成流*/
        InputStream inputStream =JDBCUtil.class.getClassLoader().getResourceAsStream("druid.properties");
        /*将流写给Properties对象*/
        properties.load(inputStream);

        /*b.获取连接池对象*/
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*2、获取连接池对象*/
    public static DataSource getDataSource(){
        return dataSource;
    }

    /*3、获取连接对象*/
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }


}
